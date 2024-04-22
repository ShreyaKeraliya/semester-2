import java.util.Scanner;

class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalVowels[] = {0, 0, 0, 0, 0}; // totalVowels[0] for 'a', totalVowels[1] for 'e', ...

        while (true) {
            System.out.print("Enter a sentence or type 'quit' to exit: ");
            String sentence = scanner.nextLine();

            if ("quit".equalsIgnoreCase(sentence)) {
                break;
            }

            int vowels[] = countVowels(sentence);
            incrementTotalVowels(totalVowels, vowels);

            System.out.println("Vowel count in the sentence:");
            printVowelCount(vowels);
        }

        System.out.println("\nTotal vowel count for all sentences:");
        printVowelCount(totalVowels);
    }

    private static int[] countVowels(String sentence) {
        int vowels[] = {0, 0, 0, 0, 0};
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (c == 'a') {
                vowels[0]++;
            } else if (c == 'e') {
                vowels[1]++;
            } else if (c == 'i') {
                vowels[2]++;
            } else if (c == 'o') {
                vowels[3]++;
            } else if (c == 'u') {
                vowels[4]++;
            }
        }

        return vowels;
    }

    private static void incrementTotalVowels(int[] totalVowels, int[] vowels) {
        for (int i = 0; i < totalVowels.length; i++) {
            totalVowels[i] += vowels[i];
        }
    }

    private static void printVowelCount(int[] vowels) {
            System.out.printf("'%c': %d%n", (char) 'a', vowels[0]);
            System.out.printf("'%c': %d%n", (char) 'e', vowels[1]);
            System.out.printf("'%c': %d%n", (char) 'i', vowels[2]);
            System.out.printf("'%c': %d%n", (char) 'o', vowels[3]);
            System.out.printf("'%c': %d%n", (char) 'u', vowels[4]);
        
    }
}