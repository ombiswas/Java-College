class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " started executing with priority " + getPriority());
        // Your thread's task here
    }
}

public class Q26 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Setting different priorities
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        // Starting the threads
        thread1.start();
        thread2.start();

        // Getting and printing the priorities of the main thread
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
    }
}