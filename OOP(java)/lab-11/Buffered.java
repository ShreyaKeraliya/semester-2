import java.io.*;

public class Buffered {
        public static void main(String[] args) {
            String inputFilePath = "Student.txt";
            String outputFilePath = "Student1.txt";
           
            try(BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
                    String line;
                    while ((line = reader.readLine()) != null){
                        String newline = line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(newline);
                            
                        }      
                    }
               
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    
}