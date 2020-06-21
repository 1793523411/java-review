package five.demo08;

public class Point {
    private double xCoordinate;
    private double yCoordinate;
    public Point ( ) { }
    public Point(double x, double y) {
        xCoordinate = x;
        yCoordinate = y;
    }
    public String toString( )	{
        return "(" + Double.toString(xCoordinate) + ", "
                + Double.toString(yCoordinate) + ")";
    }
}
