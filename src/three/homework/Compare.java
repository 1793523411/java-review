package three.homework;
//求最大最小值
import java.io.*;
public class Compare
{
    public static void main(String[ ] args)throws IOException
    {
        int x,y,z;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter x , y , z:");
        x=(new Integer(in.readLine())).intValue();
        y=(new Integer(in.readLine())).intValue();
        z=(new Integer(in.readLine())).intValue();
        System.out.println("max is: "+(x>y?(x>z?x:z):(y>z?y:z)));
        System.out.println("min is: "+(x<y?(x<z?x:z):(y<z?y:z)));
    }
}

/*
        Enter x , y , z:
        7
        3
        0
        max is: 7
        min is: 0*/
