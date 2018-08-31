package Aug30;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteAOutputStream {
    public static void main(String[] args) throws IOException {
        String  hello="Hello world";
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        byte[] b=hello.getBytes();
        FileOutputStream fout1=new FileOutputStream("File1.txt");
        FileOutputStream fout2=new FileOutputStream("File2.txt");
        baos.write(b);
        baos.writeTo(fout1);
        baos.writeTo(fout2);
        System.out.println("hhh");
    }
}
