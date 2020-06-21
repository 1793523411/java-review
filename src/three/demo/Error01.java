package three.demo;

public class Error01 {
    public static void main (String args[ ]) {
        int i = 0;
        String greetings [ ] = {"Hello world!", "No, I mean it!", "HELLO WORLD!!"};
        while (i < 4) {
            System.out.println (greetings[i]);
            i++;
        }
   /*     Hello world!
                No, I mean it!
                HELLO WORLD!!
                Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at demo.Error01.main(Error01.java:9)*/
        System.out.println ("输出这句话");
    }

}
