package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    public void add(int hno,HashMap<Integer,AddressBook> hmap,AddressBook addressBook){
        //HashMap<Integer,AddressBook> hmap=new HashMap<>();
        hmap.put(hno,addressBook);
//        for (Map.Entry<Integer,AddressBook> obj:hmap.entrySet()
//             ) {
//            System.out.println(obj.getKey());
//            AddressBook a=obj.getValue();
//            System.out.println(a.name+a.age+a.Address);
//        }
        //display(hmap);
    }
    public void display(HashMap<Integer,AddressBook> hmap){

        for (Map.Entry<Integer,AddressBook> obj:hmap.entrySet()) {
                System.out.println(obj.getKey());
                AddressBook a=obj.getValue();
                System.out.println("Name :"+a.name+"Age :"+a.age+"Address :"+a.Address);
        }
    }
    public void remove(int hno,HashMap<Integer,AddressBook> hmap){

        hmap.remove(hno);
    }
    public void display(int hno,HashMap<Integer,AddressBook> hmap){

        for (Map.Entry<Integer,AddressBook> obj:hmap.entrySet()) {
            if(hno==obj.getKey()){
                System.out.println(obj.getKey());
                AddressBook a=obj.getValue();
                System.out.println("Name :"+a.name+"Age :"+a.age+"Address :"+a.Address);
            }
        }
    }
    public static void main(String[] args) {
        int hno;
        int i=0;
        AddressBookMain addressBookMain=new AddressBookMain();

        HashMap<Integer,AddressBook> hmap=new HashMap<>();

        do{
            AddressBook addressBook=new AddressBook();
            System.out.println("1 : Add \n2 : Delete \n3 : Search");
            Scanner scan=new Scanner(System.in);
            int option=scan.nextInt();
            if(option==1){
                System.out.println("Enter house number:");
                hno=scan.nextInt();
                System.out.println("Enter name:");
                addressBook.name=scan.next();
                System.out.println("Enter Address:");
                addressBook.Address=scan.next();
                System.out.println("Enter Age:");
                addressBook.age=scan.nextInt();
                addressBookMain.add(hno,hmap,addressBook);
            }
            if(option==2){
                System.out.println("Enter house number:");
                hno=scan.nextInt();
                if(hmap.containsKey(hno)){
                    addressBookMain.remove(hno,hmap);
                    addressBookMain.display(hmap);
                }
            }
            if(option==3){
                System.out.println("Enter house number:");
                hno=scan.nextInt();
                if(hmap.containsKey(hno)){
                    addressBookMain.display(hno,hmap);
                }
            }
            System.out.println("0 for continue, 10 for stop");
            i=scan.nextInt();
        }while (i==0);
    }
}
