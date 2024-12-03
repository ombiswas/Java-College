class Q25 {
    
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Q25 calc = new Q25();

        // Calling overloaded methods
        System.out.println("Sum of 2 integers: " + calc.add(10, 20));        // Calls add(int, int)
        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));    // Calls add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calc.add(10.5, 20.5));     // Calls add(double, double)
    }
}

