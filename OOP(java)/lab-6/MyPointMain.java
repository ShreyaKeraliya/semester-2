  public class MyPointMain{
  public static void main(String[] args) {
        ThreeDPoint point2 = new ThreeDPoint(20,45,7);
        ThreeDPoint point3 = new ThreeDPoint(10, 30, 25.5);
        System.out.println("Distance between two points: " + point2.distance(point3));
    }
  }