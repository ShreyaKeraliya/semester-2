public class Multiplication {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java RepetitiveMultiplication <x> <y>");
            System.exit(1);
        }

        int x = 0;
        int y = 0;

        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid value(s) provided. Please enter integers only.");
            System.exit(1);
        }


        int result = repetitiveMultiply(x, y);
        System.out.println("Result: " + result);
    }
    private static int repetitiveMultiply(int x, int y) {
        int result = 0;
        for (int i = 0; i < Math.abs(y); i++) {
            result += x;
        }
        if (y < 0) {
            result = -result;
        }

        return result;
    }
}