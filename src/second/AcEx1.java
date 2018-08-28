package second;

public class AcEx1 {
    protected int a;
    private int c;
    int b;
    int i=0;
    private String name;
    private float sal;

    //geters and setters to access private variable from outside
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    private void display(){

}
    public static void main(String[] args) {
        AcEx1 a=new AcEx1();
        a.a=5;
        a.display();


    }

}
