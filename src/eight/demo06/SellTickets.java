package eight.demo06;

public class SellTickets implements Runnable{
    private int tickets=200;
    public void run()
    {
        while(tickets>0)
        {
            System.out.println( Thread.currentThread().getName() +
                    " is selling ticket "+tickets--);
        }
    }

}
