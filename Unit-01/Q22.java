public class Q22 {
    // Q22. Write a Java program on String Comparison & replacement methods in string.
    public static void main(String[] args) {
        // The == operator compares references (i.e., memory addresses) of objects, not their actual content.
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);  // false, because they are different objects in memory

        // The .equals() method compares the contents or values of two objects to determine if they are logically equivalent.
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3.equals(str4));  // true, because the content of both strings is the same

        // The compareTo() method is used to compare two strings lexicographically (dictionary order). It returns:
        //0 if the strings are equal.
        //A negative integer if the current string is lexicographically less than the other string.
        //A positive integer if the current string is lexicographically greater than the other string.
        String str5 = "Apple";
        String str6 = "Banana";
        System.out.println(str5.compareTo(str6));  // Output: -1 (because "Apple" is less than "Banana")

        // The .replace() methods in Java are used to replace characters or substrings in a string.
        String str7 = "Python Program";
        System.out.println(str7.replace("Python","Java")); // Java 

        // Using replaceAll()
        String sentence = "Java is fun. Java is powerful.";
        String replaceAllSentence = sentence.replaceAll("Java", "Go");
        System.out.println("After replacing all occurrences of 'Java' with 'Go': " + replaceAllSentence);
    }
}
