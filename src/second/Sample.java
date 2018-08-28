package second;

import java.util.Scanner;

public class Sample {
    public void display(int x[]){
//        System.out.println("Before sorting");
//        for (int i=0;i<x.length;i++){
//            System.out.print(x[i]);
//            System.out.print(" ");
//        }
//        System.out.println();
        System.out.println("After sorting");
        for (int i=0;i<x.length;i++){
            for (int j=i+1;j<x.length;j++){
                if(x[i]>x[j]){
                    int temp=x[j];
                    x[j]=x[i];
                    x[i]=temp;
                }
            }
        }
        for (int i=0;i<x.length;i++){
            System.out.print(x[i]);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
//        int a[]= new int[3] ;
//        int []b={1,2,3,2,5,8};
//        int[] c=new int [2];
//        c[0]=5;
//        c[1]=5;
//        int[] d=new int[]{0,2,1,5};
//        int length=d.length;
        //System.out.println(length);
//        for(int i=0;i<d.length;i++){
//            System.out.println(d[i]);
//        }
//        char ch[]={'a','b','c','d'};
//        String[] str={"one","two"};
//        for(int i=0;i<ch.length;i++){
//            System.out.println(ch[i]);
//        }
//        for(int i=0;i<str.length;i++){
//            System.out.println(str[i]+" ");
//        }
//        String[] str={"one","two"};
//        for (String obj:str) {
//            System.out.println(obj);
//        }

//     int array[]=new int[]{10,25,0003,14,5};
//        Scanner scan=new Scanner(System.in);
//        for (int i=0;i<array.length;i++){
//            int j=i+1;
//
//            System.out.print("Enter "+ j +"th element :");
//            array[i]=scan.nextInt();
//        }
//        System.out.println("Entered array is :");
//        for (int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
        Sample s=new Sample();
        //s.display(array);
        //int dd[][]=new int[2][3];
        int dd[][]={{12,2,55},{4,55,6}};
        int row=dd.length;
        int col=dd[0].length;
        int array[]=new int[col];
//        for (int i=0;i<row;i++){
//
//          for(int j=0;j<col;j++){
//              System.out.print(dd[i][j]);
//              System.out.print(" ");
//              array[j]=dd[i][j];
//
//          }
//            s.display(array);
//            System.out.println();
//        }
        for (int i=0;i<row;i++){

            for(int j=0;j<col;j++){
                for(int k=j+1;k<col;k++){
                    if(dd[i][j]>dd[i][k]){
                        int temp=dd[i][j];
                        dd[i][j]=dd[i][k];
                        dd[i][k]=temp;
                    }

                }
                System.out.print(dd[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }

//        for (int i=0;i<row;i++){
//
//          for(int j=0;j<col;j++){
//              System.out.print(dd[i][j]);
//              System.out.print(" ");
//
//          }
//            System.out.println();
//        }

    }

}