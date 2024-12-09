import java.io.FileOutputStream;
import java.io.IOException;

public class Q32 {
    public static void main(String[] args) {
        String fileName = "outputArray.txt";  // File to write to
        
        byte[] data = {72, 101, 108, 108, 111};  // ASCII values for "Hello"
        
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            // Writing an array of bytes to the file
            fos.write(data);
            System.out.println("Array of bytes written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
