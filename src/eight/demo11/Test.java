package eight.demo11;

public class Test {
    public static void main(String[] args){
        Balls ball=new Balls();	 //新建一个球类对象
        Player0 p0=new Player0(ball);  //创建0号游戏者
        Player1 p1=new Player1(ball);  //创建1号游戏者
        Player2 p2=new Player2(ball);  //创建2号游戏者
        p0.start();   //启动0号游戏者
        p1.start();  //启动1号游戏者
        p2.start();  //启动2号游戏者
    }

}

class Balls {  //球类
    boolean flag0=false;  //0号球的标志变量，true表示已被人拿，false表示未被任何人拿
    boolean flag1=false;  //1号球的标志变量
    boolean flag2=false;  //2号球的标志变量
}

