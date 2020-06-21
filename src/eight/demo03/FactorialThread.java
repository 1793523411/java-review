package eight.demo03;

public class FactorialThread implements Runnable{
    private int num;
    public FactorialThread( int num ) {
        this.num=num;
    }
    public void run()  {
        int i=num;
        int result=1;
        while(i>0) {
            result=result*i;
            i=i-1;
        }
        System.out.println("The factorial of "+num+" is "+result);
        System.out.println("new thread ends");
    }

}
