package three.demo;

public class Erroe02 {
    public static void main(String[] args)
    {
        int[] a = new int[5];
        try   {
            setZero(a,10);
        }
        catch(ArrayIndexOutOfBoundsException ex)  {
            System.out.println("数组越界错误！");
            System.out.println("异常："+ex);
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("main()方法结束。");

    }
    private static void setZero(int[] a,int index) throws ArrayIndexOutOfBoundsException
    {
        a[index] = 0;
    }

}
