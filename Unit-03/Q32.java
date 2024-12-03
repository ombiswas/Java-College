public class Q32 {

    // Method that declares ArithmeticException using throws
    public static void divideNumbers(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void main(String[] args) {
        try {
            divideNumbers(10, 2);  // Valid division
            divideNumbers(10, 0);  // Will throw exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
