package July26;

public class Fibanacii {
    public static int getFibonacii(int n){
        if(n==1)
            return 1;
        if (n==2)
            return 1;
        return getFibonacii(n-1)+getFibonacii(n-2);
    }

    public static void main(String[] args) {

        System.out.println(getFibonacii(7));
    }
}
