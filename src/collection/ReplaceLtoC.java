package collection;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceLtoC {
    public static void main(String[] args) throws IOException {
        String S= "Hai Im Jithin.";
        FileWriter fout=new FileWriter("replace.txt");
        fout.write(S);
        fout.close();

    }
}
