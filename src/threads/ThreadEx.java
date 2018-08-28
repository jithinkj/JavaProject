package threads;

public class ThreadEx extends Thread {

    @Override
    public void run() {
        System.out.println("Thread in execution");
    }

    public static void main(String[] args) {
        ThreadEx t=new ThreadEx();
        t.start();
        ThreadEx t1=new ThreadEx();
        t1.start();
        System.out.println("main method ");
    }
}
