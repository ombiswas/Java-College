class MathOperations {
    // Overloaded method with varargs for adding integers
    int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Overloaded method with varargs for adding double values
    double add(double... numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
}

public class Q30 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Calling the method with different numbers of arguments
        System.out.println("Sum of 1, 2, 3: " + math.add(1, 2, 3));
        System.out.println("Sum of 1.1, 2.2, 3.3: " + math.add(1.1, 2.2, 3.3));
    }
}
