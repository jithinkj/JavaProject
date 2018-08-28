package first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DSList1 {
    public static void main(String[] args) {
        //generic declaration, bcz we specified type .
        ArrayList<String> al=new ArrayList();
        List<String> al1=new ArrayList<>();
        ArrayList<String>al2=new ArrayList<String>();
        al.add("jithin");
        al.add("jkj");
        al.add("jdj");
        al.add("jkj");
        al.add(null);
//        for (String obj:al) {
//            System.out.println(obj);
//        }
        ArrayList<Integer> intList=new ArrayList();
        intList.add(5);
        intList.add(78);

//        for (Integer i:intList
//             ) {
//            System.out.println(i);
//        }

//        Iterator itr=al.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        for(int i=0;i<al.size();i++){
//            System.out.println(al.get(i));
//        }

        ArrayList<String> alS=new ArrayList();
        alS.add("abc");
        alS.add("def");
        alS.add("gho");
        alS.addAll(2,al);
        alS.remove("jkj");
        alS.remove(4);
        for (String o:alS) {
            System.out.println(o);
        }


    }
}
