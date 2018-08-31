package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Products {
    int id;
    float price;
    String name;

    public Products(int id, float price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<Products> al =new ArrayList<>();

        al.add(new Products(1,5,"pen"));
        al.add(new Products(2,2.5f,"pencil"));
        al.add(new Products(2,6.5f,"book"));
        //Stream<Products> s=al.stream();
        al.stream().filter(price->price.price>2.5f).forEach(obj->{
            System.out.println("id: "+obj.id+" price: "+obj.price+" name: "+obj.name);
        });
        List<String> productNames= al.stream()
                .filter(p->p.price>2.5f)
                .map(p->p.name)
                .collect(Collectors.toList());
        System.out.println(productNames);
        System.out.println("*******");
        productNames.stream().forEach(p-> System.out.println(p));
    }
}
