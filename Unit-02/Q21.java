class Q21 {
    String name;
    int age;

    // Constructor with parameters using 'this' keyword
    Q21(String name, int age) {
        this.name = name; // 'this' refers to the instance variable
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Create a Person object
        Q21 person1 = new Q21("Om Biswas", 25);

        // Display details
        person1.display();
    }
}
