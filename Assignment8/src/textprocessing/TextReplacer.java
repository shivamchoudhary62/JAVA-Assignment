package textprocessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextReplacer {
    public static void main(String[] args) {
        String inputFilePath = "src/textprocessing/sdj.txt";
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        String modifiedContent = content.toString().replace("his", "her");

        // Optionally, write the modified content back to the file or another file
        try (FileWriter writer = new FileWriter(inputFilePath)) {
            writer.write(modifiedContent);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        System.out.println("Modified content:\n" + modifiedContent);
    }
}
