package Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\Vishal\\Desktop\\ReadWriteData.txt"; // Use double backslashes

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print any IO exceptions that occur
            }
        }
    }
