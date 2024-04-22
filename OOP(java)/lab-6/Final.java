final class Circle {
    final double PI = 3.14;
    
    public final double calculateArea(double radius) {
        return PI * radius * radius;
    }
}

 class Cylinder extends Circle {

     public double calculateArea(double radius) {
         return 2 * calculateArea(radius);
     }
}
public class Final {
    public static void main(String[] args) {
        System.out.println("Circle Area: " + new Circle().calculateArea(5));
    }
}  
