class myTh1 extends Thread {
    int count = 0;

    @Override
    public synchronized void run() {
        for(int i = 0;i<=5;i++) {
            count++;
            System.out.println("Increment: "+count);
        }
    }
}
class myTh2 extends Thread {
    myTh1 sharedTh;

    myTh2(myTh1 sharedTh) {
        this.sharedTh = sharedTh;
    }

    @Override
    public synchronized void run() {
        synchronized(sharedTh){
            for(int i = 0;i<=5;i++) {
                sharedTh.count--;
                System.out.println("Decrement: "+ sharedTh.count);
            }
        }
    }
}
public class Q33 {
    public static void main(String[] args) {
        myTh1 th1 = new myTh1();
        myTh2 th2 = new myTh2(th1);

        th1.start();
        th2.start();
    }
}