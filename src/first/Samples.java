package first;

import java.util.Scanner;

public class Samples {
    public void pattern(int r){
        for (int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void numpattern(int r){
        for (int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter no. of rows:");
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        Samples s=new Samples();
        //s.pattern(r);
        s.numpattern(r);

    }
}
