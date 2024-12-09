import java.io.FileInputStream;
import java.io.IOException;

public class Q25 {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Replace with your file path

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Convert byte to character
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
