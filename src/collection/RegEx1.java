package collection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
//        System.out.println(Pattern.matches("[\\d]{6}","123456"));
//        System.out.println(Pattern.matches("[@$%]","@"));
//        System.out.println(Pattern.matches("([\\d][a-z][\\w]{8})|([a-z][\\d][\\w]{8})|([\\w]{8}[\\d][a-z])|([\\w]{8}[a-z][\\d])|([a-z][\\w]{8}[\\d])|([\\d][\\w]{8}[a-z])","5klon5kity"));
//        System.out.println(Pattern.matches("[a-z][\\w]*@[a-z]+.com","j5@yahoo.com"));
//        System.out.println(Pattern.matches("[+]91[0-9]{10}","+919447655630"));
        System.out.println(Pattern.matches("[0123][0-9][/][01][012][/][0-9]{4}","04/12/1995"));
        //dd/mm/yyyy
        //write string into a file. replace "l" tp c.
        boolean b=false;
        Pattern p=Pattern.compile("java");
        Matcher m=p.matcher("hi java ,hello java");
        while (m.find()){
            System.out.println("found :"+m.group()+" starting at index :"+m.start()+" ending index :"+m.end());
            b=true;
    }
        if(!b){
            System.out.println("not found");
        }
    }
}
