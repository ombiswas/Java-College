public class Q26 {
    // Q26. Write a Java program to find the largest element in an array.
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //  Program to find the largest element in the array
        int largest = largestElement(array);
        System.out.println("The largest element in the array is " + largest);
    }

    public static int largestElement(int[] array) {
        int largest = array[0];

        // Iterate through the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}
