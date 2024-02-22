import java.util.*;
public class Bank_Account{
     int accountNo;
     String userName;
     String email;
     String accountType;
     double accountBalance;

    public void getAccountDetails() {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter Account Details:");
        accountNo = sc.nextInt();
        userName = sc.next();
        email = sc.next();
        accountType = sc.next();
        accountBalance = sc.nextDouble();
    }

    public void displayAccountDetails() {
        System.out.println("\nDisplaying Account Details:");
        System.out.println("Name: " + userName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
}