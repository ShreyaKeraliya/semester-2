// import java.util.Scanner;

public class TotalSum {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            try {
                int number = Integer.parseInt(args[i]);
                validateNumber(number);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid value provided. Please enter integers only.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Total sum: " + sum);
    }

    private static void validateNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Error: Number is negative.");
        }

        if (number % 10 == 0) {
            throw new IllegalArgumentException("Error: Number is evenly divisible by 10.");
        }

        if (number > 1000 && number < 2000) {
            throw new IllegalArgumentException("Error: Number is greater than 1000 and less than 2000.");
        }

        if (number > 7000) {
            throw new IllegalArgumentException("Error: Number is greater than 7000.");
        }
    }
}