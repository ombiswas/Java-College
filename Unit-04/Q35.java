import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Q35 {
    public static void main(String[] args) {
        // Creating and demonstrating ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println("ArrayList: " + arrayList);

        // Using get() and remove()
        System.out.println("Element at index 2 in ArrayList: " + arrayList.get(2)); // 30
        arrayList.remove(1);  // Removes element at index 1 (20)
        System.out.println("ArrayList after removal: " + arrayList);

        // Creating and demonstrating LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        System.out.println("LinkedList: " + linkedList);

        // Using addFirst() and removeLast()
        linkedList.addFirst(50);  // Adds 50 at the beginning
        linkedList.removeLast();  // Removes the last element (400)
        System.out.println("LinkedList after adding first and removing last: " + linkedList);

        // Creating and demonstrating Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(500);
        vector.add(600);
        vector.add(700);
        vector.add(800);
        System.out.println("Vector: " + vector);

        // Using set() and size()
        vector.set(2, 750);  // Replaces element at index 2 (700) with 750
        System.out.println("Vector after setting index 2: " + vector);
        System.out.println("Size of the Vector: " + vector.size());
    }
}
