import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize account numbers and balances
        int[] accountNumbers = {101, 102, 103, 104, 105};
        double[] balances = {5000.0, 3000.0, 7000.0, 10000.0, 2500.0};

        while (true) {
            System.out.println("\n*** Simple Banking System ***");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exiting... Thank you for using the banking system!");
                break;
            }

            // Get account number input
            System.out.print("Enter your account number: ");
            int accountNumber = scanner.nextInt();

            // Find the account index
            int index = findAccount(accountNumbers, accountNumber);

            if (index == -1) {
                System.out.println("Invalid account number!");
                continue;
            }

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Current balance: ₹" + balances[index]);
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balances[index] += depositAmount;
                        System.out.println("Successfully deposited ₹" + depositAmount);
                        System.out.println("Updated balance: ₹" + balances[index]);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount > 0 && withdrawalAmount <= balances[index]) {
                        balances[index] -= withdrawalAmount;
                        System.out.println("Successfully withdrew ₹" + withdrawalAmount);
                        System.out.println("Updated balance: ₹" + balances[index]);
                    } else {
                        System.out.println("Invalid or insufficient funds.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    // Method to find account index in the array
    private static int findAccount(int[] accountNumbers, int accountNumber) {
        for (int i = 0; i < accountNumbers.length; i++) {
            if (accountNumbers[i] == accountNumber) {
                return i;
            }
        }
        return -1; // Account not found
    }
}
