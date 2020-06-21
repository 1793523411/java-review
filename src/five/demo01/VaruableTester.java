package five.demo01;

public class VaruableTester {
    public static void main(String []args)
    {
        Shape2D var1,var2;
        var1=new  Rectangle(5,6);
        System.out.println("Area of var1 = " + var1.area());
        var2=new Circle(2.0);
        System.out.println("Area of var2 = " + var2.area());
    }
}
