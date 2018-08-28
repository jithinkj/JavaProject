package second;

public class B extends A {
    int num=1;
    int ee=2;
     public B(){
        System.out.println("Child class constructor");
    }
    public  void display(){
        System.out.println("child class display");
        super.display();//to call parent method
    }
    public static void main(String[] args) {
        B obj=new B();

        obj.a=obj.num;
        obj.b=obj.ee;
        System.out.println(obj.a+" "+obj.b);
        obj.display();//overriding, call child method
    }
}
