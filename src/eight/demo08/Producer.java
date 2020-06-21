package eight.demo08;

public class Producer extends Thread{
    Tickets t=null;
    public Producer(Tickets t) { this.t=t;}
    public void run() {
//        while((t.number)<t.size) {
//            synchronized(t) { // 申请对象t的锁旗标
//                System.out.println("Producer puts ticket "+(++t.number));
//                t.available=true;
//                try {
//                    Thread.sleep( 1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }     // 释放对象t的锁旗标
//        }
        while((t.number)<t.size) {
            t.put();
        }
        System.out.println("Producer ends!");
    }

}
