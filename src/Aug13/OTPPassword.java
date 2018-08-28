package Aug13;

import java.util.Random;

public class OTPPassword {
    public static void main(String[] args) {


        System.out.println(passwordMethod(5));
    }

//    static char[] passwordMethod(int len){
//        System.out.println("Your new password is: ");
//        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String small="abcdefghijklmnopqrstuvwyz";
//        String num="013456789";
//        String val=caps+small+num;
//        Random r = new Random();
//
//        char[] e=r.nextBytes(val);
//
//    }
    static String passwordMethod(int len){
        System.out.println("Your new password is: ");
        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwyz";
        String num="013456789";
        String val=caps+small+num;
        Random rand=new Random();
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < len; i++) {
            int randIndex=rand.nextInt(val.length());
            res.append(val.charAt(randIndex));
        }
        return res.toString();
    }


}
