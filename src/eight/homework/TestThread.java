package eight.homework;

import java.util.Random;

public class TestThread extends Thread {
    @Override
    public void run() {

        test();
    }

    public void test() {
        //随机数  随机出休眠时间
        Random a = new Random();

        for (int i = 0; i < 10; i++) {
            int b = a.nextInt(1000);
            System.out.println(this.getName());
            //System.out.println(b);
            try {

                Thread.sleep(b);


            } catch (InterruptedException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
            //当某个线程输出到第10个的时候    得到要去的城市 并直接结束
            if (i == 9) {
                System.out.println("我想去" + this.getName());
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {


        TestThread city1=new TestThread();
        city1.setName("北京");
        city1.start();


        TestThread city2=new TestThread();
        city2.setName("上海");
        city2.start();


    }
}
