package eight.demo09;

public class Test {
    public static void main(String[] args) {
        Tickets t = new Tickets(10);
        new Consumer(t).start();
        new Producer(t).start();
    }

}

class Tickets {
    int size;  //票总数
    int number = 0;  //存票序号
    int i = 0;   //售票序号
    boolean available = false;  //是否有待售的票

    public Tickets(int size) {
        this.size = size;
    }

    public synchronized void put() {
        if (available)  //如果还有存票待售，则存票线程等待
            try {
                wait();
            } catch (Exception e) {
            }
        System.out.println("Producer puts ticket " + (++number));
        available = true;
        notify();   //存票后唤醒售票线程开始售票
    }

    public synchronized void sell() {
        if (!available)   //如果没有存票，则售票线程等待
            try {
                wait();
            } catch (Exception e) {
            }
        System.out.println("Consumer buys ticket " + (number));
        available = false;
        notify();       //售票后唤醒存票线程开始存票
        if (number == size) number = size + 1; //在售完最后一张票后，
        //设置一个结束标志，number>size表示售票结束
    }
}

