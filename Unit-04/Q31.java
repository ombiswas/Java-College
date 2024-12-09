// import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q31 {
    public static void main(String[] args) {
        // File name
        String fileName = "demo.txt";

        // Write data to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a sample text file.\n");
            writer.write("It contains multiple lines of text.\n");
            writer.write("This is the third line.");
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Read data from the file and display the content
        try (FileReader reader = new FileReader(fileName); 
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            System.out.println("\nContent of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
