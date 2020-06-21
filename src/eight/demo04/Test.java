package eight.demo04;

public class Test {
    public static void main( String [] args ) {
        TestThread thread1 = new TestThread();
        TestThread thread2 = new TestThread();
        TestThread thread3 = new TestThread();
        System.out.println( "Starting threads" );

        new Thread(thread1,"Thread1").start();
        new Thread(thread2,"Thread2").start();
        new Thread(thread3,"Thread3").start();

        System.out.println( "Threads started, main ends\n" );
    }
}
