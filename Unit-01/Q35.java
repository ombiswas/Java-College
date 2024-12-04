public class Q35{
    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 2. Convert to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr);

        // 3. Substring
        String substring = str.substring(7, 12);  // Extracts "World"
        System.out.println("Substring (7 to 12): " + substring);

        // 4. Replace characters
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);

        // 5. Trim whitespace
        String strWithSpaces = "   Hello, Java!   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}
