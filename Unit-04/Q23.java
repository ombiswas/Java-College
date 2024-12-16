//  Write a program in Java to write data to a text file using FileWriter.
import java.io.FileWriter;
import java.io.IOException;

public class Q23 {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Specify the file path here
        String data = "This is a sample text written to the file.";

        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(data);
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
