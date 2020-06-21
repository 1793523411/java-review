package eight.demo12;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException{
        TestThread t=new TestThread();
        t.start();
        new BufferedReader(new InputStreamReader(System.in))
                .readLine(); //等待键盘输入
        t.stopme();   //调用stopme方法结束t线程
    }

}

