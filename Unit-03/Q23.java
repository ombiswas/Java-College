// Extending the Thread class to create a custom thread
class MyThread extends Thread {
    // Constructor to set thread name
    public MyThread(String name) {
        super(name);
    }

    // Overriding the run() method to define the thread's task
    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(getName() + " is running: " + i);
        }
    }
}

public class Q23 {
    public static void main(String[] args) {
        // Creating two thread objects
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Starting the threads
        thread1.start();
        thread2.start();

        // Main thread continues its execution
        System.out.println("Main thread is running.");
    }
}
