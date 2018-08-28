package second;

import java.util.ArrayList;
import java.util.Scanner;

public class Accounts extends Bank {
    int num;
    String Name;
    float balance;
    String code;

    public Accounts(int id,String bankcode,int num, String name, float balance, String code) {
        super(id,bankcode);
        this.num = num;
        Name = name;
        this.balance = balance;
        this.code = code;
    }

    public void display(){
        System.out.println("Name:"+Name+" num:"+num+" balance"+balance+" code:"+code+" Bank Id:"+super.id+" Bankcode:"+super.code);
    }
    public void display(int id){
        System.out.println("Name:"+Name+" num:"+id+" balance"+balance+" code:"+code+" Bank Id:"+super.id+" Bankcode:"+super.code);
    }

    public void dep(float amount){
        balance=balance+amount;
        System.out.println("Name:"+Name+" num:"+id+" balance"+balance+" code:"+code+" Bank Id:"+super.id+" Bankcode:"+super.code);
    }
    public void ret(float amount){
        balance=balance-amount;
        System.out.println("Name:"+Name+" num:"+id+" balance"+balance+" code:"+code+" Bank Id:"+super.id+" Bankcode:"+super.code);
    }
    public static void main(String[] args) {
        Accounts a1= new Accounts(100,"SBI",1,"aaa",1000,"aa");
        Accounts a2= new Accounts(101,"SIB",2,"bbb",250,"ghg");
        Accounts a3= new Accounts(102,"CS",3,"ccc",1258,"gh");
        Accounts a4= new Accounts(103,"ER",4,"ddd",693,"kjuk");
        //Accounts[] accountArray={a1,a2,a3,a4};
        ArrayList<Accounts> accountArrayList=new ArrayList();
        accountArrayList.add(a1);
        accountArrayList.add(a2);
        accountArrayList.add(a3);
        accountArrayList.add(a4);
        for (Accounts obj:accountArrayList) {
            obj.display();
        }
        System.out.println("Enter the account number");
        Scanner scan =new Scanner(System.in);
        int number=scan.nextInt();
        for (Accounts obj:accountArrayList) {
            if(number==obj.num){
                obj.display(number);
            }

        }
        System.out.println("Enter 1 for deposit ,2 for retrieve to this account.And 3 for remove account");
        int choice=scan.nextInt();

        for (Accounts obj:accountArrayList) {
            if(choice==1 && number==obj.num){
                System.out.println("Enter amount");
                int amount=scan.nextInt();
                obj.dep(amount);
            }
            else if(choice==2 &&number==obj.num){
                System.out.println("Enter amount");
                int amount=scan.nextInt();
                obj.ret(amount);
            }
            else if(choice ==3){
                //remove
                accountArrayList.remove(obj);
                break;

            }

        }
        if(choice==3){
            for (Accounts obj1:accountArrayList) {
                obj1.display();
            }
        }


    }
}
