package six.demo03;


public class Test {
    public static void main ( String [] args ) {
        if ( args.length == 2 )  new CopyMaker().copy(args[0], args[1]);
        else   System.out.println("Please Enter File names");
    }
}
