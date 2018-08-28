package second;

public class Products {
    int id;
    String name;
    float price;

    public Products(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Products p1=new Products(1,"Pen",25f);
        Products p2=new Products(2,"TV",10050f);
        Products p3=new Products(3,"Fridge",5000f);
        Products p4=new Products(4,"Pencil",10f);

        Products[] pp={p1,p2,p3,p4};
        for (Products obj:pp) {
          if(obj.price>1000)  {
              System.out.println("Id:"+obj.id+" Name:"+obj.name+" Price:"+obj.price);
          }
        }
    }
}
