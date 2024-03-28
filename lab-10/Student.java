import java.io.*;
import java.util.*;

class Student {
    private String name;
    private int age;
    private int gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = (int) gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = (int) gpa;
    }
//------------------------------------------------------
    public void writeToFile(FileOutputStream fos) throws IOException {
        byte[] nameBytes = this.name.getBytes();
        fos.write(nameBytes.length);
        fos.write(nameBytes);
        fos.write(this.age);
        fos.write((int) this.gpa);
    }

    //------------------------------------------------------
    public void readFromFile(FileInputStream fis) throws IOException {
        int nameLength = fis.read();
        byte[] nameBytes = new byte[nameLength];
        fis.read(nameBytes);
        this.name = new String(nameBytes);
        this.age = fis.read();
        this.gpa = fis.read();
    }
}