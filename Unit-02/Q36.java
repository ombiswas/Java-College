// Interface 1
interface Animal {
    void eat();
    void sleep();
}

// Interface 2
interface Bird {
    void fly();
    void chirp();
}

// Class that implements multiple interfaces
class Sparrow implements Animal, Bird {
    // Implementing methods from Animal interface
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    public void sleep() {
        System.out.println("Sparrow is sleeping");
    }

    // Implementing methods from Bird interface
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void chirp() {
        System.out.println("Sparrow is chirping");
    }
}

public class Q36 {
    public static void main(String[] args) {
        // Creating object of Sparrow class
        Sparrow sparrow = new Sparrow();

        // Calling methods from both interfaces
        sparrow.eat();    // From Animal interface
        sparrow.sleep();  // From Animal interface
        sparrow.fly();    // From Bird interface
        sparrow.chirp();  // From Bird interface
    }
}
