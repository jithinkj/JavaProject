package Aug14CollecionsExample;

public class SecondLagest {
    public static void main(String[] args) {
        int[] a={10,74,30,46,20,36,78,100,56,89};
        int second=a[0];
        int first=a[0];
        for (int i=1;i<a.length;i++){
            if(first<a[i]){
                first=a[i];
            }
        }
        for (int j=0;j<a.length;j++){
            if(second<a[j] && first>a[j]){
                second=a[j];
            }
        }

        System.out.println("First max : "+first);
        System.out.println("second max : "+second);
            ///////////////////////Array Split/////////////////////////
        //int len=a.length/2;

        int a1[]=new int[a.length/2];
        int a2[]=new int[a.length/2];
        for (int i=0,j=0;i<a.length;i++){
            if (i<a.length/2){
                a1[i]=a[i];
            }
            else{
                a2[j]=a[i];
                j++;
            }
        }
        System.out.print("first array :");
        for (int e1:a1) {
            System.out.print(e1+",");
        }
        System.out.println();
        System.out.print("second array :");
        for (int e2:a2) {
            System.out.print(e2 +",");
        }
    }
}
