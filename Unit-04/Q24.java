// Write a Java program to demonstrate the use of BufferReader.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q24 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
