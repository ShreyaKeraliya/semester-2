class MyPoint {
    private  double x;
    private  double y;

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

    public void distance(MyPoint other) {
        double X = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public void distance(double x, double y) {
        double Y = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        System.out.println(Y);
    }
    public void printXY(){
        System.out.println("x :"+x+","+"y :"+y);
    }
 
}