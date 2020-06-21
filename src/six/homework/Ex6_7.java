package six.homework;

import java.io.*;

public class Ex6_7 {

    public static void main(String[] args) throws IOException {

        String fileName1 = "/home/ygj/IdeaProjects/review2/src/six/homework/test02.txt";

        FileWriter writer1 = new FileWriter(fileName1);

        String fileName2 = "/home/ygj/IdeaProjects/review2/src/six/homework/test03.txt";

        FileWriter writer2 = new FileWriter(fileName2);

        System.out.print("输入一些字符  ");

        BufferedReader in = new BufferedReader(

                new InputStreamReader(System.in));

        String s;

        s = in.readLine();

        System.out.print("这些字符是:            ");

        System.out.println(s);

        char[] array = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {

            array[i] = s.charAt(i);

            writer1.write(array[i]);

        }

        writer1.close();

        char temp;

        for (int i = 0; i < s.length() - 1; i++) {

            for (int j = i + 1; j < s.length(); j++) {

                if (array[j] < array[i]) {

                    temp = array[i];

                    array[i] = array[j];

                    array[j] = temp;

                }

            }

        }

        System.out.print("排序后的字符 :     ");

        for (int i = 0; i < s.length(); i++) {

            writer2.write(array[i]);

            System.out.print(array[i]);

        }

        writer2.close();

        System.out.println();

    }

}