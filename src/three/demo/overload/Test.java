package three.demo.overload;

public class Test {
    public static void main(String args[]){
        MethodOverloading m = new MethodOverloading();
        m.receive(2);
        m.receive(5.6);
        m.receive(3,4);
        m.receive(7,8.2);
        m.receive("Is it fun?");
    }

}
