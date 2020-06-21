package three.homework;
//求阶乘
import java.io.*;
public class Factorial
{
    public static void main(String[ ] args)throws IOException
    {
//        int n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
//        n=(new Integer(in.readLine())).intValue();
//        System.out.println(compute(n));
        for(int i=2;i<=10;i+=2)
            System.out.println(compute(i));
    }
    public static int compute(int n){
        if(n<1)
            return 1;
        return compute(n-1)*n;
    }
}

/*      2
        24
        720
        40320
        3628800*/

