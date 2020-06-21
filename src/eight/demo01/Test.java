package eight.demo01;

public class Test {
    public static void main(String[] args) {
        System.out.println("main thread starts");
        FactorialThread thread = new FactorialThread(10);
        thread.start();
        try {
            Thread.sleep(1);
        } catch (Exception e) {
        };
        System.out.println("main thread ends ");
    }

}
