package eight.demo04;

public class TestThread implements Runnable{
    private int sleepTime;
    public TestThread() {
        sleepTime = ( int ) ( Math.random() * 6000 );
    }
    public void run() {
        try {
            System.out.println(
                    Thread.currentThread().getName() + " going to sleep for "
                            + sleepTime );
            Thread.sleep( sleepTime );
        }
        catch ( InterruptedException exception ) {};
        System.out.println( Thread.currentThread().getName()+ "finished" );
    }

}
