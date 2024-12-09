import java.util.ArrayList;

public class Q26 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // 1. add(): Adding elements to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println("Initial ArrayList: " + colors);

        // 2. remove(): Removing an element by index
        colors.remove(1); // Removes "Blue"
        System.out.println("After removing the second element: " + colors);

        // 3. addAll(): Adding elements from another ArrayList
        ArrayList<String> moreColors = new ArrayList<>();
        moreColors.add("Yellow");
        moreColors.add("Orange");
        colors.addAll(moreColors); // Adding all elements from moreColors
        System.out.println("After adding elements from another list: " + colors);

        // Additional step: Displaying elements using forEach
        System.out.println("All colors in the list:");
        colors.forEach(System.out::println);
    }
}
