class Goodmorning extends  Thread {
    @Override
    public void run() {
        while (true) {
            try {
                    System.out.println("Good Morning");
                
                Thread.sleep(1000);
             }
            catch (InterruptedException e) {
                e.printStackTrace();
                }      
    }
}
}
class Goodafternoon extends  Thread  {
    @Override
    public void run() {
        while (true) {
            try {
                    System.out.println("Good afternoon");
                
                Thread.sleep(3000);
             }
            catch (InterruptedException e) {
                e.printStackTrace();
                }      
    }
}
}

public class Good {
   public static void main(String[] args) {
    Thread morning = new Goodmorning();
    morning.start();
    Thread afternoon = new Goodafternoon();
    afternoon.start();

   }
    
}

