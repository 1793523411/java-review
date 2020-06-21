package eight.demo11;

class Player1 extends Thread {  //0号游戏者的类
    private Balls ball;

    public Player1(Balls b) {
        this.ball = b;
    }

    public void run() {
        while (true) {
            while (ball.flag1 == true) {
            }
            ; //如果1号球已被拿走，则等待
            ball.flag1 = true;  //拿起1号球
            while (ball.flag0 == true) {
            }
            ;  //如果0号球已被拿走，则等待
            if (ball.flag1 == true && ball.flag0 == false) {
                ball.flag0 = true;  //拿起0号球
                System.out.println("Player0 has got two balls!");
                ball.flag1 = false;  //放下1号球
                ball.flag0 = false;  //放下0号球
                try {
                    sleep(1);
                } catch (Exception e) {
                }
                ; //放下后休息1ms
            }
        }
    }
}
