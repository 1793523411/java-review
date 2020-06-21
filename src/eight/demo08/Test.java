package eight.demo08;

public class Test {
    public static void main(String[] args) {
        Tickets t=new Tickets(10);
        new Consumer(t).start();
        new Producer(t).start();
    }

}

class Tickets {
    int size;  //票总数
    int number=0;  //存票序号
    int i=0;   //售票序号
    boolean available=false;  //是否有待售的票
    public Tickets(int size) {  this.size=size;  }
    public synchronized void put() {  //同步方法，实现存票的功能
        System.out.println("Producer puts ticket "+(++number));
        available=true;
    }
    public synchronized void sell() {  //同步方法，实现售票的功能
        if(available==true && i<=number)
            System.out.println("Consumer buys ticket "+(++i));
        if(i==number)   available=false;
    }

}

