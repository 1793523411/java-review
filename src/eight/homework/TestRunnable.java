package eight.homework;

import java.util.Random;

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        //随机数  随机出休眠时间
        Random a = new Random();

        for (int i = 0; i < 10; i++) {
            int b = a.nextInt(1000);
            System.out.println(Thread.currentThread().getName());
            //System.out.println(b);
            try {

                Thread.sleep(b);


            } catch (InterruptedException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
            //当某个线程输出到第10个的时候    得到要去的城市 并直接结束
            if (i == 9) {
                System.out.println("我想去" + Thread.currentThread().getName());
                System.exit(0);
            }
        }

    }

    public static void main(String[] args) {


        TestRunnable city1 = new TestRunnable();
        Thread t1 = new Thread(city1, "北京");
        t1.start();


        TestRunnable city2 = new TestRunnable();
        Thread t2 = new Thread(city2, "上海");
        t2.start();


    }

}
