package seven.demo04;
import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTester2 {
    public static void main(String args[]) {
        String[]  num = {"one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"};
        Vector  aVector = new Vector(java.util.Arrays.asList(num));
        System.out.println("Before Vector: " + aVector);
        Enumeration nums = aVector.elements();
        while(nums.hasMoreElements()) {
            String aString = (String)nums.nextElement();
            System.out.println(aString);
            if (aString.length() > 4)    aVector.remove(aString);
        }
        System.out.println("After Vector: " + aVector);
    }
}
