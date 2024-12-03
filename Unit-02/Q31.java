// Parent class
class Parent {
    // Protected method
    protected void display() {
        System.out.println("Parent's display method");
    }
}

// Child class inherits from Parent and overrides the display() method
class Child extends Parent {
    // Overriding the display() method with a public access modifier
    @Override
    public void display() {
        System.out.println("Child's display method");
    }
}

public class Q31 {
    public static void main(String[] args) {
        // Creating an object of Parent class
        Parent parent = new Parent();
        parent.display();  // Calls Parent's display method

        // Creating an object of Child class
        Parent child = new Child();
        child.display();   // Calls Child's display method (method overriding)
    }
}
