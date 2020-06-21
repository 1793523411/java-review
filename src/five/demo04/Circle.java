package five.demo04;

public class Circle implements Shape2D {

    double radius;
    String color;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return (pi * radius * radius);
    }

    public void setColor(String str) {
        color = str;
        System.out.println("color=" + color);
    }

}
