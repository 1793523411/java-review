package seven.demo04;
import java.util.Vector;
import java.util.Iterator;

public class IteratorTester {
    public static void main(String args[]) {
        String[]  num = {"one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"};
        Vector   aVector = new Vector(java.util.Arrays.asList(num));
        System.out.println("Before Vector: " + aVector);
        Iterator nums = aVector.iterator();
        while(nums.hasNext()) {
            String aString = (String)nums.next();
            System.out.println(aString);
            if (aString.length() > 4)    nums.remove();
        }
        System.out.println("After Vector: " + aVector);
    }

}
