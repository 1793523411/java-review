package eight.demo02;

public class Test {
    public static void main( String [] args )  {
        //创建并命名每个线程
        TestThread thread1 = new TestThread( "thread1" );
        TestThread thread2 = new TestThread( "thread2" );
        TestThread thread3 = new TestThread( "thread3" );
        System.out.println( "Starting threads" );
        thread1.start(); // 启动线程1
        thread2.start(); // 启动线程2
        thread3.start(); // 启动线程3
        System.out.println( "Threads started, main ends\n" );
    }
}
