class BankAccount {
    private int balance = 1000; // Initial balance

    // Synchronized method to withdraw money
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed the withdrawal. Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient funds for withdrawal.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class Customer extends Thread {
    BankAccount account;
    int amount;

    public Customer(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class Q33 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        // Creating multiple customer threads with withdrawal requests
        Customer customer1 = new Customer(account, 500);
        Customer customer2 = new Customer(account, 700);

        // Starting threads
        customer1.start();
        customer2.start();
    }
}
