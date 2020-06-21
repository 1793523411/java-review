package five.demo08;

public class Ball {
    private Point center;     //中心点
    private double radius;    //半径
    private String colour;    //颜色
    public Ball( ) { }
    public Ball(double xValue, double yValue, double r) {
        center = new Point(xValue, yValue); //调用Point中的构造方法
        radius = r;
    }
    public Ball(double xValue, double yValue, double r, String c) {
        this(xValue, yValue, r); // 调用三个参数的构造方法
        colour = c;
    }
    public String toString( ) {
        return "A ball with center " + center.toString( ) + ", radius "
                + Double.toString(radius) + ", colour " + colour;
    }

}
