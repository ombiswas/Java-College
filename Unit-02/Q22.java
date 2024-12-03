// Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Subclass (inherited from Animal)
class Dog extends Animal {
    // Providing implementation of the abstract method
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class Q22 {
    public static void main(String[] args) {
        // Cannot instantiate Animal directly
        // Animal animal = new Animal(); // This will cause a compilation error

        // Creating object of Dog (subclass of Animal)
        Animal dog = new Dog();
        dog.sound();  // Calls the overridden method in Dog class
        dog.sleep();  // Calls the concrete method in Animal class
    }
}
