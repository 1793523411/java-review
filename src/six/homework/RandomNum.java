package six.homework;

import java.io.*;
import java.util.Scanner;

public class RandomNum {
    String name;
    int n;
    int Max;
    int Min;

    public int Random() {
        int m = java.util.concurrent.ThreadLocalRandom.current().nextInt(Max - Min) + Min;
        return m;
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        RandomNum r = new RandomNum();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入文件名");
        String s = in.next();
//        r.name = "E:" + File.separator + "desktop" + File.separator + "test" + File.separator + "java-test"
//                + File.separator + s + ".txt";
        // E:\desktop\test\java-test
        r.name = "/home/ygj/IdeaProjects/review2/src/six/homework/"+s+".txt";
        FileWriter w = new FileWriter(r.name);
        System.out.println("请输入整数个数");
        r.n = in.nextInt();
        System.out.println("请输入最大值：");
        r.Max = in.nextInt();
        System.out.println("请输入最小值：");
        r.Min = in.nextInt();
        for (int i = 0; i < r.n; i++) {
            w.write("" + r.Random() + "  ");

        }
        w.close();
    }

}