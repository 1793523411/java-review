package eight.demo07;

public class Test {
    public static void main(String[] args) {
        Tickets t=new Tickets(10);
        new Consumer(t).start();
        new Producer(t).start();
    }

}
class Tickets {
    int number=0;          //票号
    int size;                   //总票数
    boolean available=false;  //表示目前是否有票可售
    public Tickets(int size)  //构造函数，传入总票数参数
    {
        this.size=size;
    }
}

