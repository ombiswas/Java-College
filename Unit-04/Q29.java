import java.util.ArrayList;

public class Q29 {
    public static void main(String[] args) {
        // Create an ArrayList that can hold heterogeneous data
        ArrayList<Object> heterogeneousList = new ArrayList<>();

        // Add elements of different data types
        heterogeneousList.add("Hello, World!"); // String
        heterogeneousList.add(42);             // Integer
        heterogeneousList.add(3.14);           // Double
        heterogeneousList.add(true);           // Boolean
        heterogeneousList.add('A');            // Character

        // Display the contents of the list
        System.out.println("Contents of the ArrayList: " + heterogeneousList);

        // Access and display each element with its type
        for (Object element : heterogeneousList) {
            System.out.println("Element: " + element + ", Type: " + element.getClass().getSimpleName());
        }
    }
}
