// Case 1: Extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Thread) is executing.");
    }
}

// Case 2: Implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Runnable) is executing.");
    }
}

// Case 3: Synchronization of threads
class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

// Case 4: Thread priority example
class PriorityThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
    }
}

public class Q35 {
    public static void main(String[] args) throws InterruptedException {
        // Case 1: Extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Case 2: Implementing Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();

        // Case 3: Synchronization of threads
        Counter counter = new Counter();

        // Creating multiple threads to access shared resource
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for threads t1 and t2 to finish
        t1.join();
        t2.join();

        // Display final count after synchronization
        System.out.println("Final count: " + counter.getCount());

        // Case 4: Setting thread priorities
        PriorityThread t3 = new PriorityThread();
        t3.setPriority(Thread.MIN_PRIORITY);  // Lowest priority (1)
        PriorityThread t4 = new PriorityThread();
        t4.setPriority(Thread.NORM_PRIORITY); // Default priority (5)
        PriorityThread t5 = new PriorityThread();
        t5.setPriority(Thread.MAX_PRIORITY);  // Highest priority (10)

        t3.start();
        t4.start();
        t5.start();
    }
}
