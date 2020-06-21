package eight.demo03;

public class Test {
    public static void main( String [] args ) {
        System.out.println("main thread starts");
        FactorialThread t=new FactorialThread(10);
        new Thread(t).start();
        System.out.println("new thread started,main thread ends " );
    }

}
