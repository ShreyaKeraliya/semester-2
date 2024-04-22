import java.util.*;


class Animal{
    String name;
    static int noOfAnimal=0;
    int typeOfAnimal;
    int TotalNumberOfLegs;

    public Animal(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name of animal :");
        name =sc.next();
       noOfAnimal++;

    }
}
class Lion extends Animal{
    final int leg =4;
    static int noOfLion=0;
    Lion(){
        System.out.println("Enter name of animal :");
        noOfLion++;
    }

}
class Tiger extends Animal{
    final int leg =4;
    static int noOfTiger=0;
    Tiger(){
        noOfTiger++;
    }

}








public class Main {
    public static void main(String[] args){
        Animal L1= new Lion();
    }
    
}
