package third;

import java.util.*;

public class Example {
    public static void main(String[] args) {

//        ArrayList al=new ArrayList();
//        al.add("jkj");
//        al.add(123);
//        for (Object o:al
//             ) {
//            System.out.println(o);
//        }

//        LinkedList<String> li =new LinkedList<>();
//        li.add("jithin");
//        li.add("sam");
//        li.addFirst("Mr. ");
//        li.addLast("!!!!");
//        li.add(null);
//        li.removeLast();
//        for (String s:li
//             ) {
//            System.out.println(s);
//        }


//        LinkedHashSet<String> set=new LinkedHashSet<>();
//        set.add("aa");
//        set.add("lll");
//        set.add("kjk");
//        set.add("zzz");
//        set.add(null);
//
//        for (String s:set
//             ) {
//            System.out.println(s);
//        }

        TreeSet<String> treeset=new TreeSet<>();
        treeset.add("aa");
        treeset.add("lll");
        treeset.add("ccc");

        treeset.add("kjk");
        treeset.add("zzz");
        //treeset.add(null);

        for (String s:treeset
                ) {
            System.out.println(s);
        }

    }
}
