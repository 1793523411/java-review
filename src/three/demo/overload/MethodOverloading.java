package three.demo.overload;

public class MethodOverloading {
    public void receive(int i){
        System.out.println("Receive one int parameter. ");
        System.out.println("i="+i);
    }
    public void receive(double d){
        System.out.println("Receive one double parameter. ");
        System.out.println("d="+d);
    }
    public void receive(String s){
        System.out.println("Receive one String parameter. ");
        System.out.println("s="+s);
    }
    public void receive(int i,int j){
        System.out.println("Receive two int parameters. ");
        System.out.println("i=" + i + "  j=" + j);
    }
    public void receive(int i,double d){
        System.out.println("Receive one int parameter and one double parameter. ");
        System.out.println("i=" + i + "  d=" + d);
    }

}
