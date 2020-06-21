package eight.demo05;

public class Test {
    public static void main( String [] args )  {
        TestThread threadobj = new TestThread();
        System.out.println( "Starting threads" );

        new Thread(threadobj,"Thread1").start();
        new Thread(threadobj,"Thread2").start();
        new Thread(threadobj,"Thread3").start();

        System.out.println( "Threads started, main ends\n" );
    }

}
