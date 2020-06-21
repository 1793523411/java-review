package five.demo05;

public class BindingTester {
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        int n;
        for(int i = 0; i < s.length; i++) {
            n = (int)(Math.random() * 3);
            switch(n) {
                case 0: s[i] =  new Circle(); break;
                case 1: s[i] =  new Square(); break;
                case 2: s[i] =  new Triangle();
            }
        }
        for(int i = 0; i < s.length; i++)   s[i].draw();
    }

}
/**
 * 编译时无法知道s数组元素的具体类型，运行时才能确定类型，所以是动态绑定
 * 在主方法的循环体中，每次随机生成指向一个Circle、Square或者Triangle的引用
 */
