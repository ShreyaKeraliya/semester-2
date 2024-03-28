class RowSumThreads extends Thread{
    public void run(){
        int m = 4;
        int n = 5;
        int[][] matrix = new int[m][n];
        int[] rowSums = new int[m];
        int  R = (int)( Math.random()*10);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = R;
            }
        }
            for (int j = 0; j < n; j++) {
                int i=1;
                final int row = i;
                rowSums[row] += matrix[row][j];
            }

            System.out.println("Row Sums:");
            for (int i = 0; i < m; i++) {
                System.out.println("Row " + i + ": " + rowSums[i]);
            }
    }
 }
    
public class RowThreads {
    public static void main(String[] args) {
        int m = 4;
        Thread[] threads = new Thread[m];
        for (int i = 0; i < m; i++) {
            threads[i] = new RowSumThreads();
            threads[i].start();
        }

       
    }
}