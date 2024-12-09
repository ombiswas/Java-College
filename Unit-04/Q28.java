import java.util.ArrayList;

public class Q28 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 1. add(): Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial List: " + fruits);

        // 2. get(): Accessing an element by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // 3. set(): Modifying an element at a specific index
        fruits.set(1, "Blueberry");
        System.out.println("After modification: " + fruits);

        // 4. remove(): Removing an element by index
        fruits.remove(2); // Removes "Cherry"
        System.out.println("After removal: " + fruits);

        // 5. size(): Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the list: " + size);
    }
}
