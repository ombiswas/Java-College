// Write a program in Java to read data from a text file using FileReader.
import java.io.FileReader;
import java.io.IOException;

public class Q22 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("example.txt")) {
            int character;
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
