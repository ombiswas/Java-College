// Define a class named 'Person'
class Person {
    // Instance variables (attributes)
    String name;
    int age;

    // Constructor to initialize the attributes
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to run the program
public class Q27 {
    public static void main(String[] args) {
        // Create an object of the 'Person' class
        Person person1 = new Person("Om Biswas", 30);

        // Call the method on the object
        person1.displayDetails();
    }
}
