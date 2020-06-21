package eight.demo12;

public class TestThread extends Thread{
    private boolean flag=true;
    public void stopme() {   //在此方法中控制循环条件
        flag=false;
    }
    public void run() {
        int i=0;
        while(flag) {
            System.out.println(i++);  //如果flag为真则一直显示递增整数
            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
