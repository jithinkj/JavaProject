package Aug13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToCollections {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("Details.txt"));

        ArrayList<Student> list=new ArrayList<>();

        String str;
        while ((str= br.readLine())!=null){
            String[] x=str.split(",");
            list.add(new Student(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));

        }
        for (Student obj:list) {
            System.out.println("Id: "+obj.id+" Name: "+obj.name+" Mark: "+obj.mark);
        }
    }
}
