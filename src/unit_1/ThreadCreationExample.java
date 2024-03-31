package unit_1;

class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getName()+" is running");
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        MyThread mt2 = new MyThread();
        Thread t2 = new Thread(mt2);
        t2.start();
        System.out.println("Main thread is running");


    }
}
