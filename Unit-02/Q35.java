// Parent class (Base class)
class Animal {
    // Method in parent class
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class 1 (derived from Animal)
class Dog extends Animal {
    // Additional method specific to Dog  Bird bird = new Bird();
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class 2 (derived from Animal)
class Cat extends Animal {
    // Additional method specific to Cat
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Q35 {
    public static void main(String[] args) {
        // Creating objects of each child class
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling methods from Animal class
        dog.eat();   // Inherited from Animal class
        dog.sleep(); // Inherited from Animal class
        dog.bark();  // Specific to Dog class

        System.out.println(); // Line break for clarity

        cat.eat();   // Inherited from Animal class
        cat.sleep(); // Inherited from Animal class
        cat.meow();  // Specific to Cat class
    }
}
