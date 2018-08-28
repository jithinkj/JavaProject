package third;

import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        boolean b=Pattern.matches(".b","ab");
        System.out.println(b);
        System.out.println(Pattern.matches("[abc]","a"));
        System.out.println(Pattern.matches("[^abc]","x"));
        System.out.println(Pattern.matches("[a-zA-Z]","A"));
        System.out.println(Pattern.matches("[a-z]{3}","aaa"));
        System.out.println(Pattern.matches("[a-d[^m-p]]","c"));
    }
}
