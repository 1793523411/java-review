package five.demo01;

public class InterfaceTester {
    public static void main(String  args[]){
        Rectangle rect=new Rectangle(5,6);
        System.out.println("Area of rect = " + rect.area());
        Circle cir=new Circle(2.0);
        System.out.println("Area of cir = " + cir.area());
    }
}

