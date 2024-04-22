import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        String filePath = "input.txt"; 
        int charCount = 0, wordCount = 0, lineCount = 0;

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
            }

            scanner.close();

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }
    }
}