package five.demo09;

public class Sandwich extends PortableLunch {
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();
    Sandwich(){System.out.println("Sandwich()");}
    public static void main(String[] args) {  new Sandwich();  }
}
/**
 * Meal()
 * Lunch()
 * PortableLunch()
 * Bread()
 * Cheese()
 * Lettuce()
 * Sandwich()
 */
