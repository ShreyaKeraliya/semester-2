import java.io.*;
public class FileExist {
    public static void main(String[] args) {
        String fileName = args[0];
        File file = new File(fileName);

        if(!file.exists()){
            System.out.println("File or directory not found");

        }
        else{
            if(file.isFile()){
                System.out.println("File Size : "+ file.length());
            }
            else{
                File[] files =file.listFiles();

                if(file != null){
                    for(File f: files){
                        System.out.println(f.getName());
                    }
                }
            }
        }
    }
}
