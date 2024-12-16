// Explain the use of FileInputStream with examples.
import java.io.FileInputStream;
import java.io.IOException;

public class Q25 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Convert byte to character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
