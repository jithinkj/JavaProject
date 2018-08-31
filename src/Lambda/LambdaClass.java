package Lambda;

@FunctionalInterface
interface Drawable{
    public void draw(String name,int z);
}
public class LambdaClass {
    public static void main(String[] args) {
        int width=10;
         //with lambda
        Drawable d2=(x,y)->{
            System.out.println("Drawable "+width+" name "+x +" num "+y);
        };
        d2.draw("abc",4);
    }
}
