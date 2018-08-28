package third;

import java.util.ArrayDeque;

public class CollectionExQ {
    public static void main(String[] args) {
        ArrayDeque<String> obj=new ArrayDeque<String>();
        obj.addFirst("jithin");
        obj.addLast("jerin");
        obj.add("anju");
        obj.add("sam");
        obj.add("sterin");
        System.out.println(obj);
        System.out.println("head "+obj.peek());//returns the first element
        System.out.println("removed first "+obj.pollFirst());//remove and return 1st element and returns null if empty
        System.out.println("removed last "+obj.pollLast());
        System.out.println("after removal" +obj);
        System.out.println(obj.remove());//remove first
        System.out.println(obj.removeFirst());// remove and return first element
        System.out.println(obj.removeLast());//remove and return last element
        System.out.println(obj);
    }


}
