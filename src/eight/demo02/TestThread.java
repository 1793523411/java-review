package eight.demo02;

public class TestThread extends Thread{
    private int sleepTime;
    public TestThread( String name ) {
        super( name );
        sleepTime = ( int ) ( Math.random() * 6000 );
    }
    public void run() {
        try {
            System.out.println(
                    getName() + " going to sleep for " + sleepTime );
            Thread.sleep( sleepTime ); //线程休眠
        }
        catch ( InterruptedException exception ) {};
        System.out.println( getName() + " finished");
    }
}
