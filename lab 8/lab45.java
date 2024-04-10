import java.util.Scanner
public class lab45{
    Public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    System.out.print(Enter String);
    String a=sc.next();
    int b;
    b=a.length();
    for(int i=b/2;i<b;i++){
        System.out.println(a.charAt(i));
        }
    }
}