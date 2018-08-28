package July24;

public class Sample {
    @Override
    protected void finalize()  {
        System.out.println("before garbage collection");
    }
    public static void main(String[] args) {
        System.gc();
        Sample s=new Sample();
        s=null;
        Sample s1=new Sample();
        s1=null;
        System.gc();
    }
}
