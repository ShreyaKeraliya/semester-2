import java.util.Scanner;
public class lab46{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String a=sc.next();
		if(a.charAt(0)>65 && a.charAt(0)<92){
			System.out.println("correct");
		}
		else{
			System.out.println("error");
		}
	}
}