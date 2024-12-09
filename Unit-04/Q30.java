import java.util.ArrayList;
import java.util.List;

public class Q30 {
    public static void main(String[] args) {
        // Create a List using the ArrayList implementation
        List<String> languages = new ArrayList<>();

        // 1. add(): Adding elements to the List
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println("Initial List: " + languages);

        // 2. add(index, element): Adding an element at a specific index
        languages.add(1, "JavaScript");
        System.out.println("After adding at index 1: " + languages);

        // 3. get(): Accessing elements by index
        String language = languages.get(2);
        System.out.println("Element at index 2: " + language);

        // 4. remove(): Removing an element by index
        languages.remove(3);
        System.out.println("After removing element at index 3: " + languages);

        // 5. contains(): Checking if an element exists
        boolean containsJava = languages.contains("Java");
        System.out.println("Does the list contain 'Java'? " + containsJava);

        // 6. size(): Getting the size of the List
        int size = languages.size();
        System.out.println("Size of the list: " + size);

        // 7. forEach(): Iterating through the List
        System.out.println("Languages in the list:");
        languages.forEach(System.out::println);
    }
}
