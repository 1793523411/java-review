package eight.demo13;

public class Test {
    public static void main(String[] args) {
        TestThread[] runners = new TestThread[2];
        for (int i = 0; i < 2; i++) runners[i] = new TestThread(i);
        runners[0].setPriority(2);   //设置第一个线程优先级为2
        runners[1].setPriority(3);   //设置第二个线程优先级为3
        for (int i = 0; i < 2; i++) runners[i].start();
    }

}
