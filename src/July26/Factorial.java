package July26;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    public static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {

        System.out.println(fact(5));
    }
}
