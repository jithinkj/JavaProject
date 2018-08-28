package collection;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        //1
//        HashMap<Integer,String> hmap=new HashMap<>();
//        hmap.put(1,"jithin");
//        hmap.put(2,"anju");
//        hmap.put(32,"sam");
//        hmap.put(3,"samson");
//        hmap.put(null,"sam");
//
//
//        hmap.remove(2);
//        for (Map.Entry obj:hmap.entrySet()) {
//            System.out.println("key " +obj.getKey()+" ,value "+obj.getValue());
//        }
        //For iterating we have to convert it into entry-set.


            //2

//        HashMap<Integer,Student> hmap=new HashMap<>();
//
//        hmap.put(2,new Student(1,"jithin","tcr"));
//        hmap.put(3,new Student(2,"anju","ijk"));
//        hmap.put(4,new Student(3,"sam","mlr"));
//
//        for (Map.Entry<Integer,Student> obj:hmap.entrySet()) {
//            System.out.println("rollno:"+obj.getKey());
//            System.out.println("Details of student");
//            Student s=obj.getValue();
//            System.out.println("id:"+s.id+" Name:"+s.name+" Address:"+s.address);
//        }

            //3

//        LinkedHashMap<String,String> obj=new LinkedHashMap<>();
//        obj.put("1","asd");
//        obj.put("2","sss");
//
//        for (Map.Entry<String,String> obj1:obj.entrySet()
//             ) {
//            System.out.println(obj1.getKey());
//            System.out.println(obj1.getValue());
//        }



        //4 treemap

        TreeMap<Integer,String> tmap=new TreeMap<>();
        tmap.put(20,"jkj");
        tmap.put(3,"alan");
        tmap.put(1,"ancy");
        for (Map.Entry<Integer,String> obj:tmap.entrySet()
             ) {
            System.out.println(obj.getKey()+obj.getValue());
        }
    }
}
