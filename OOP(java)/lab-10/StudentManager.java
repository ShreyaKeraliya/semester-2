import java.io.*;
public class StudentManager {
    public static void main(String[] args) {
        Student s = new Student("student 1", 20, 9.5);
        try (FileOutputStream fos = new FileOutputStream("students.txt")) {
            s.writeToFile(fos);
            System.out.println("Student information written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("students.txt")) {
            // Student s2 = new Student("Student 2", 20, 8.55);
            s.readFromFile(fis);
            System.out.println("Student information read from file: " + s.getName() + ", " + s.getAge() + ", " + s.getGpa());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}