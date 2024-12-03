// Parent class (Base class)
class Animal {
    // Method in parent class
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class (derived from Animal)
class Dog extends Animal {
    // Method in child class
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Grandchild class (derived from Dog)
class Puppy extends Dog {
    // Method in grandchild class
    void play() {
        System.out.println("Puppy is playing");
    }
}

public class Q33 {
    public static void main(String[] args) {
        // Creating object of Puppy class
        Puppy puppy = new Puppy();

        // Calling methods from all levels
        puppy.eat();   // Inherited from Animal class
        puppy.bark();  // Inherited from Dog class
        puppy.play();  // Defined in Puppy class
    }
}
