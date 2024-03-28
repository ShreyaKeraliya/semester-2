import java.io.*;
public class DigitCounter{
   public static void main(String[] args) {
    if (args.length != 1) {
        System.err.println("Usage: java DigitCounter <filename>");
        System.exit(1);
    }

    String filename = args[0];
    int count = 0;

    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
        int ch;
        while ((ch = reader.read()) != -1) {
            if (ch == '5') {
                count++;
            }
        }
    } catch (IOException e) {
        System.err.println("Error reading file: " + e.getMessage());
        System.exit(2);
    }

    System.out.println("The digit 5 occurred " + count + " times in the file.");
    }
}