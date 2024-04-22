class oddnumber extends Thread{
    public void run(){
        for (int i = 1; i <= 20; i = i + 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 class evennumber extends Thread{
    public void run(){
        for (int i = 2; i <= 20; i+=2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Number {
    public static void main(String[] args) {
        Thread oddThread = new oddnumber();
        Thread evenThread = new evennumber();
        oddThread.start();
        evenThread.start();
    }
}