public class MyPoint1{
    private int x;
    private int y;

    public MyPoint1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(MyPoint1 other) {
        int deltaX = this.x - other.x;
        int deltaY = this.y - other.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

 class ThreeDPoint extends MyPoint1 {
    private double z;

    public ThreeDPoint() {
        super(0, 0);
        this.z = 0;
    }

    public ThreeDPoint(int x, int y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double distance(MyPoint1 other) {
        ThreeDPoint other3D = (ThreeDPoint) other;
        int deltaX = this.getX() - other3D.getX();
        int deltaY = this.getY() - other3D.getY();
        double deltaZ = this.z - other3D.z;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }

  
}