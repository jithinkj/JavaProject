package Lambda;

import java.util.ArrayList;

public class Stream {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(3);
        java.util.stream.Stream<Integer> s=al.stream();
//        s.forEach(m->{
//            System.out.println(m);
//        });
//        s.filter(x->x>2).forEach(m->{
//            System.out.println(m);
//        });


        // to modification, use map
        s.map(item-> item*item).forEach(p->{
            System.out.println(p);
        });
        ArrayList<String> al1=new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.stream().filter(t->t.contains("t")).forEach(q->{
            System.out.println(q);
        });
    }
}
