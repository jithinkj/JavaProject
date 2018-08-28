package second;

import java.sql.SQLOutput;

public class PolyExample {
    //Polymorphism

    //Method overloading, compile time polymorphism
    public void display(){
        System.out.println("disaplay function");
    }
    public void display(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        PolyExample p=new PolyExample();
        p.display();
        p.display("hai");
    }
}
