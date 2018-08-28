package first;

public class StringExample {
    public static void main(String[] args) {
        String s="hello";
//        String obj=new String("hello world");
//        String s1 = "hello";
//        s.concat("world");
//        System.out.println(s);
//        StringBuffer sb=new StringBuffer("java");
//        sb.append("8");
//        System.out.println(sb);
        String s1="hello";
        String s2="abc";
        String s3=" bcd ";
        String s4="helloworld";
       // boolean e= s1.equals(s);
        System.out.println(s.equalsIgnoreCase(s3));
        System.out.println(s.equals(s3));
        System.out.println(s3.compareTo(s2));
        System.out.println(s3.trim());
        System.out.println(s3.length());
        System.out.println(s4.substring(0,5));
        System.out.println(s4.charAt(1));
    }



}
