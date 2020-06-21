package five.demo04;

public class ExtendsInterfaceTester {
    public static void main(String []args) {
        Circle cir;
        cir=new Circle(2.0);
        cir.setColor("blue");
        System.out.println("Area = " + cir.area());
    }
}
