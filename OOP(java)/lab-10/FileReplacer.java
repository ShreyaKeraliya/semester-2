import java.io.*;


public class FileReplacer {
    public static void main(String[] args) {
        String inputFilePath = "file1.txt";
        String outputFilePath = "file2.txt";
        String searchWord = "word1";
        String replaceWord = "word2";

        int replacementCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int index = 0;
                String newLine = line;
                while ((index = newLine.indexOf(searchWord, index)) != -1) {
                    newLine = newLine.substring(0, index) + replaceWord + newLine.substring(index + searchWord.length());
                    replacementCount++;
                    index += replaceWord.length();
                }
                writer.write(newLine);
                writer.newLine();
            }

            System.out.println("Number of replacements: " + replacementCount);

        } catch (IOException e) {
            System.out.println("Error reading or writing files");
            e.printStackTrace();
        }
    }
}