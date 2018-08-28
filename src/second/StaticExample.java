package second;

public class StaticExample
{
    static int i=1;
    int j=1;
    StaticExample(){
        ++i;
        ++j;
        System.out.println(i+" "+j);
    }
    static class InnerStatic{
        public void showMessage(){
            System.out.println("hello");
        }
        public static void printfn(){
            System.out.println("static function of inner class");
        }
    }//Static class is always innerclass
    public static void display()
    {
        System.out.println("static function");
    }//static method can't access non static variables

    static {

        System.out.println("Static");
    }//static block


    public static void main(String[] args) {
        System.out.println("main");
        StaticExample s =new StaticExample();
        StaticExample s1  =new StaticExample();
        System.out.println(s.j+" "+i);
        display();
        InnerStatic.printfn();
        InnerStatic in=new InnerStatic();
        in.showMessage();

    }
}
