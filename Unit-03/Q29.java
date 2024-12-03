class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Task1: " + i);
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'C'; c++) {
            System.out.println("Task2: " + c);
        }
    }
}

public class Q29 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start(); // Start Task1
        t2.start(); // Start Task2
    }
}
