package five.demo01;

public class Circle implements Shape2D {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return (pi * radius * radius);
    }

}
