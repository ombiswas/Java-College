import java.util.Scanner;
import java.util.Arrays;

public class Q27 {
    // Q27. Write a program, which will read a string and rewrite it in the alphabetical order.
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to a char array
        char[] charArray = input.toCharArray();

        // Sort the char array
        Arrays.sort(charArray);

        // Convert the sorted char array back to a string
        String sortedString = new String(charArray);

        // Output the sorted string
        System.out.println("String in alphabetical order: " + sortedString);

        // Close the scanner
        scanner.close();
    }
}
