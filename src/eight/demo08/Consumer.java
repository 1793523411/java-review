package eight.demo08;

public class Consumer extends Thread{
    Tickets t=null;
    int i=0;
    public Consumer(Tickets t) {   this.t=t;  }
    public void run() {
//        while(i<t.size) {
//            synchronized(t) {  //申请对象t的锁旗标
//                if(t.available==true && i<=t.number)
//                    System.out.println("Consumer buys ticket "+(++i));		          if(i==t.number) {
//                    try{Thread.sleep(1);}catch(Exception e){}
//                    t.available=false;
//                }
//            }	//释放对象t的锁旗标
//        }
        while(i<t.size) {
            t.sell();
        }
        System.out.println("Consumer ends");
    }

}
