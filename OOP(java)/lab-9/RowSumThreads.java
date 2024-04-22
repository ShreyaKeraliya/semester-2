import java.util.Random;

public class RowSumThreads {

    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        int[][] matrix = new int[m][n];

        Random R = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = R.nextInt(100);
            }
        }

        Thread[] threads = new Thread[m];
        int[] rowSums = new int[m];

        for (int i = 0; i < m; i++) {
            final int row = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < n; j++) {
                    rowSums[row] += matrix[row][j];
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < m; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Row Sums:");
        for (int i = 0; i < m; i++) {
            System.out.println("Row " + i + ": " + rowSums[i]);
        }
    }
}