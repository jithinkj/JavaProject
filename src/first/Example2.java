package first;

import java.util.Scanner;

public class Example2 {
    public void check(int x){
        if((x%4==0 && x%100!=0)||x%400==0)
            System.out.println("Leap year");
        else
            System.out.println("Not Leap year");
    }
    public static void main(String[] args) {
        System.out.println("Enter a year to check whether it is a leap year or not :");
        Scanner s=new Scanner(System.in);
        int x= s.nextInt();
        Example2 e=new Example2();
        e.check(x);
    }

}