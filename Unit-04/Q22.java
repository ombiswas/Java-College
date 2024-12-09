import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q22 {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Specify the file path here

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
