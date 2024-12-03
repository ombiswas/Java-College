// Define an interface
interface Animal {
    // Abstract method (no body)
    void sound();

    // Abstract method
    void sleep();
}

// Implementing the interface in a class
class Dog implements Animal {
    // Providing implementation for sound() method
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    // Providing implementation for sleep() method
    @Override
    public void sleep() {
        System.out.println("Dog sleeps.");
    }
}

class Q29 {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Animal myDog = new Dog();

        // Calling methods from the interface
        myDog.sound();
        myDog.sleep();
    }
}
