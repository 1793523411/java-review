package four.hidden;

public class Test {
    public static void main(String[] args)
    {
        A1 a1 = new A1();
        a1.setx(4);
        a1.printa();

        B1 b1 = new B1();
        b1.printb();
        b1.printa();

        b1.setx(6);  // 将继承来的x值设置为6
        b1.printb();
        b1.printa();
        a1.printa();
    }

}
/**
 * 子类不能继承父类中的静态属性，但可以对父类中的静态属性进行操作。如在上面的例子中，将“int x = 2;”改为“static int x = 2;”，再编译及运行程序，会得到下面的结果
 * 4
 * super.x= 14  x= 100
 * 14
 * super.x= 16  x= 100
 * 16
 * 16
 * 在上面的结果中，第一行及最后一行都是语句“a1.printa();”输出的结果，显然类Ｂ中的printb()方法修改的是类Ａ中的静态属性x
 */
