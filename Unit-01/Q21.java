public class Q21 {
    // Q21. Write a Java program on validation method which is used in string.
    public static void main(String[] args) {
        // The 'length()' method in Java is used to determine the number of characters in a string. It returns an integer value.
        String str1 = "Java Programming";
        System.out.println(str1.length()); // 16

        // The 'isEmpty()' method in Java is used to check whether a string or collection (like List, Set, etc.) is empty, i.e., whether it contains any characters or elements. Returns 'true' if length of the string is 0. Otherwise, it returns 'false'.
        String str2 = "";
        String str3 = "Hello";
        System.out.println(str2.isEmpty());  // Output: true
        System.out.println(str3.isEmpty());  // Output: false

        // The 'trim()' method in Java is used to remove any leading and trailing whitespace characters from a string.
        String str4 = "   Hello World   ";
        // Applying trim method
        System.out.println("Original: '" + str4 + "'"); // Original: '   Hello World   '
        System.out.println("Trimmed: '" + str4.trim() + "'"); // Trimmed: 'Hello World'
    }
}
