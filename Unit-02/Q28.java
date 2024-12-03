// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class Q28 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); 
        dog.sound();
    }
}
