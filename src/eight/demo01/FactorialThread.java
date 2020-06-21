package eight.demo01;

public class FactorialThread extends Thread{
    private int num;
    public FactorialThread( int num ) {
        this.num=num;
    }
    public void run() {
        int i=num;
        int result=1;
        System.out.println("new thread started" );
        while(i>0) {
            result=result*i;
            i=i-1;
        }
        System.out.println("The factorial of "+num+" is "+result);
        System.out.println("new thread ends");
    }
}
