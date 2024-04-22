public final class Circle {
    final double PI = 3.14;
    
    public final double calculateArea(double radius) {
        return PI * radius * radius;
    }
}

public class Cylinder extends Circle {
    // This will cause a compile-time error
    // public double calculateArea(double radius) {
    //     return 2 * super.calculateArea(radius);
    // }
}