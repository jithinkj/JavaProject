import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        //System.out.println("Hello World");

//        a=a^b;
//        b=a^b;
//        a=a^b;
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("a="+a+"  b="+b+"  after swap ");
//        int i=2;
//        int k=i++;
//        int z= ++i;
//        int u=10;
//        int j=--u;
//        System.out.println(k);
//        System.out.println(z);
//        System.out.println(j);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=s.nextInt();
        System.out.println("Enter b:");
        int b=s.nextInt();
        System.out.println("Enter b:");
        int c=s.nextInt();
//        if (a == b) {
//            System.out.println("a not equal to b");
//        }
//        else if (a<b)
//            System.out.println("b is greater");
//        else if (a>b)
//            System.out.println("a is greater");
//        else
//            System.out.println("not equal");
        if ((a==b)||(a==c))
            System.out.println("a  equal to b, or a  equal to c");
    }

}
