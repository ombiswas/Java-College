import java.util.LinkedList;

public class Q34 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Printing the list
        System.out.println("Original list: " + list);

        // Adding an element at a specific index
        list.add(2, "Fig");
        System.out.println("List after adding Fig at index 2: " + list);

        // Getting an element at a specific index
        String fruit = list.get(3);
        System.out.println("Element at index 3: " + fruit);

        // Removing an element by value
        list.remove("Banana");
        System.out.println("List after removing Banana: " + list);

        // Clearing the list
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}