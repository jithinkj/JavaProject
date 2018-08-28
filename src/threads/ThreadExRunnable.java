package threads;

public class ThreadExRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("Thread in execution");
            System.out.println(i);
            try{
                Thread.sleep(1000);//should be here. bcz of interrupted Exception.
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        ThreadExRunnable obj=new ThreadExRunnable();
        Thread t=new Thread(obj);
        t.setName("thread 1");
        t.start();
        Thread t1=new Thread(obj);
        t1.setName("thread 2");
        t1.start();
        System.out.println("main method");
    }
}
