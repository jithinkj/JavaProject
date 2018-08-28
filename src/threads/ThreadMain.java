package threads;

class Thread1 extends Thread{

    Sample s;
    Thread1(Sample s){
        this.s=s;
    }

    @Override
    public void run() {
        s.display(5);
    }
}
class Thread2 extends Thread{
    Sample s;
    Thread2(Sample s){
        this.s=s;
    }
    @Override
    public void run() {
       s.display(100);
    }
}
public class ThreadMain {
    public static void main(String[] args) {
        Sample s=new Sample();
        Thread1 t=new Thread1(s);
        Thread2 t1=new Thread2(s);
        t.start();
        t1.start();
        Sample s1=new Sample();
        Thread1 t2=new Thread1(s1);
        Thread2 t3=new Thread2(s1);
        t2.start();
        t3.start();
    }


}
