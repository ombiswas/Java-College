public class Q30 {
    // Write a Java program to find the sum of elements in a single-dimensional array.
    public static void main(String[] args) {
        // Declaring a single-dimensional array
        int[] array = {1,2,3,4,5};

        // Creating a flag variable
        int temp = 0;

        // Calculating the sum of elements of the single-dimensional array
        for (int i=0; i< array.length; i++) {
            temp += array[i];
        }
        // Printing the result
        System.out.println("The sum of the elements of the single dimensional array is " + temp);
    }
}
