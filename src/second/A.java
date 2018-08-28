package second;

public class A {
    int a;
    int b;

    public A() {
        System.out.println("Parent class constructor");
    }

    public  void display(){
        System.out.println("Hai Jithin");
    }

    public static void main(String[] args) {
        AcEx1 obj=new AcEx1();
        String name=obj.getName();
        obj.setName("jithin");
    }

}
