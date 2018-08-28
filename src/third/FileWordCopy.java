package third;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWordCopy {
    public static void main(String[] args) throws IOException {
        FileReader fin=new FileReader("third.txt");
        ArrayList<String> al=new ArrayList<>();
        int ch=0;
        String s=new String();
        while((ch=fin.read())!=-1){
                char c=(char)ch;
                String s1=Character.toString(c);
                s =   s.concat(s1);
        }
        String[] a=s.split(" ");
        for (String obj:a
             ) {
            al.add(obj);
        }
        System.out.println(al);
    }
}
