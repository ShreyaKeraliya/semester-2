public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public class Point{
        public static void main(String[] args) {
            MyPoint p1 = new MyPoint(6,8);
            MyPoint p2 = new MyPoint(3,4);
            distance(5);
            distance(2,2);
        }
    }
}