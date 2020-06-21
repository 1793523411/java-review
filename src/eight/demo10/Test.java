package eight.demo10;

public class Test {
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.setDaemon(true);
        t.start();
    }
}

/**
 * 运行程序，则发现整个程序在主线程结束时就随之中止运行了，如果注释掉t.setDaemon(true)语句，则程序永远不会结束
 */
class ThreadTest extends Thread {
    public void run() {
        while (true) {
        }
    }
}

