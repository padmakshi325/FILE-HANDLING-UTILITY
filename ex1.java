import java.io.*;
import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        String filename = "sample.txt";

        // Write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("This is a sample text.\n");
            writer.write("Learning file handling in Java.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read from the file
        System.out.println("Reading from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Modify file content (replace 'Java' with 'JAVA')
        try {
            List<String> lines = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line.replace("Java", "JAVA"));
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (String modifiedLine : lines) {
                writer.write(modifiedLine);
                writer.newLine();
            }
            writer.close();
            System.out.println("File content modified.");
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }
}
