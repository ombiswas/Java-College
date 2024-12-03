// Parent class
class Animal {
    void sound() {
        System.out.println("Animal is making sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class Q26 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
