package third;

import java.io.*;

public class FileEx {
    public static void main(String[] args) throws IOException {
        //ByteStream
//        FileOutputStream fout=new FileOutputStream("first.txt");
//        //fout.write(12);
//        String s="java test pgm file .";
//        byte[] b=s.getBytes();
//        fout.write(b);
//        fout.close();
//        FileInputStream fin=new FileInputStream("first.txt");
//        int temp=0;
//        while ((temp=fin.read())!=-1){
//            System.out.print((char)temp);
//        }
        //System.out.println(fin.read());

            //CharacterStream

//        FileWriter fout= new FileWriter("second.txt");
//        //FileOutputStream fout1= new FileOutputStream("third.txt");
//        FileWriter fout2= new FileWriter("third.txt");
//        fout.write("hai, hello world");
//        fout.close();
//        FileReader fin=new FileReader("second.txt");
//        //System.out.println((char) fin.read());
//        int ch=0;
//        while((ch=fin.read())!=-1){
////            System.out.println((char) ch);
//
//            fout2.write((char)ch);
//
//        }
//        fout2.close();

            //BufferedReader
        System.out.println("Input  a line:");
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String line=reader.readLine();
        System.out.println(line);

    }
}
