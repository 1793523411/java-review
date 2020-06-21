package eight.demo13;

public class TestThread extends Thread {
    private int tick = 1;
    private int num;

    public TestThread(int i) {
        this.num = i;
    }

    public void run() {
        while (tick < 400000) {
            tick++;
            if ((tick % 50000) == 0) {  //每隔5000进行显示
                System.out.println("Thread #" + num + ", tick = " + tick);
                yield();  //放弃执行权
                try {
                    sleep(1);
                } catch (Exception e) {
                }
                ;
            }
        }
    }
}
