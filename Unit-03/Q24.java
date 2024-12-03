// Creating a thread by implementing the Runnable interface
class MyRunnable implements Runnable {
    // Overriding the run() method
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            try {
                // Making the thread sleep for 300 milliseconds
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}

public class Q24 {
    public static void main(String[] args) {
        // Creating a Runnable object
        MyRunnable myRunnable = new MyRunnable();

        // Creating two threads and passing the Runnable object to their constructors
        Thread thread1 = new Thread(myRunnable, "Thread 1");
        Thread thread2 = new Thread(myRunnable, "Thread 2");

        // Starting the threads
        thread1.start();
        thread2.start();

        // Main thread continues
        System.out.println("Main thread is running.");
    }
}
