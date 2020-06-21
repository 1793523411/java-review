package five.demo03;

public class MultilnterfaceTester {
    public static void main(String args[]) {
        Circle cir;
        cir=new Circle(2.0);
        cir.setColor("blue");
        System.out.println("Area = " + cir.area());
    }
}
