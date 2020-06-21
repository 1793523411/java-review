package eight.demo06;

public class Test {
    public static void main(String[] args){
        SellTickets t=new SellTickets();
        new Thread(t,"111").start();
        new Thread(t,"222").start();
        new Thread(t,"333").start();
    }

}
