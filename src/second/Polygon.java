package second;

public class Polygon {
    public void area(float r){
        System.out.println(3.14*r*r);
    }
    public void area(float l,float b){
        System.out.println(l*b);
    }

    public static void main(String[] args) {
        Polygon p=new Polygon();
        p.area(6f);
        p.area(2,3);
    }
}
