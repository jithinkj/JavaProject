package third;

import java.util.Iterator;
import java.util.LinkedList;

public class Book {
    String name;
    float price;
    String author;

    public Book(String name, float price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public Book() {
    }

    public static void main(String[] args) {
        LinkedList<Book> booklist=new LinkedList<>();
        Book b1=new Book("Hp",200,"JK");
        Book b2=new Book("aa",33,"hgh");
        Book b3=new Book("bb",67,"mhjh");
        booklist.add(b1);
        booklist.add(b2);
        booklist.add(b3);

        Iterator itr=booklist.iterator();
//        while (itr.hasNext()){
//            Book b=(Book) itr.next();
//            System.out.println(b.name+" "+b.price+" "+b.author);
//        }
        for (Book obj:booklist){
            if(booklist.contains(b1)){
                b1.price=300;
            }
        }
        while (itr.hasNext()){
            Book b=(Book) itr.next();
            System.out.println(b.name+" "+b.price+" "+b.author);
        }
    }

}
