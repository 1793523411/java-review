package five.demo01;

public class Rectangle implements Shape2D {
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public double area() {
        return (width * height);
    }

}
