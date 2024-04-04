import java.io.*;
public class StudentDetail{
    public static void main(String[] args) {
    	String filename = "Detail.txt";
    	try{
    		BufferedWriter bw =new BufferedWriter(new FileWriter(filename));
    		bw.write("Birva,25\n");
    		bw.write("mansi,19\n");
    		bw.write("Bhoomi,18\n");
    		bw.write("Komal,20\n");
    		bw.close();
    		System.out.println("done");
    	}
    	catch(Exception e){
    		e.printStackTrace();

    	}
    	try{
    		BufferedReader br =new BufferedReader(new FileReader(filename));
    		String line;
    		while((line = br.readLine())!=null){
    			String[] word =line.split(",");
    			String name =word[0];
    			int age = Integer.parseInt(word[1]);
    			Student st = new Student(name,age);
    			System.out.println(st);
    		}
            br.close();

    	}
    	catch(Exception e){
    		e.printStackTrace();

    	}
    }
}


class Student{
	String name;
	int age;
	public  Student(String name,int age){
        this.name =name;
        this.age =age; 
	}
	public String toString(){
		return "name"+name+","+age;
	}
}