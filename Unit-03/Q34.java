class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - Count: " + i);
        }
    }
}

public class Q34 {
    public static void main(String[] args) {
        // Create threads with different priorities
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);     // Lowest priority (1)
        t2.setPriority(Thread.NORM_PRIORITY);   // Default priority (5)
        t3.setPriority(Thread.MAX_PRIORITY);    // Highest priority (10)

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
