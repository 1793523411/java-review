package eight.demo07;

public class Producer extends Thread{
    Tickets t=null;
    public Producer(Tickets t)
    {	this.t=t;  	}
    public void run()
    {
        while( t.number < t.size)
        {
            System.out.println("Producer puts ticket "
                    +(++t.number));
            t.available=true;
            try {
                Thread.sleep( 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
