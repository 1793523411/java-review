package four.equals;

public class Test {
    public static void main(String args[]) {
        Apple a = new Apple("red", true);
        Apple b = new Apple("red", true);
        System.out.println(a + " is equal to " + b + ": " + a.equals(b));
        System.out.println("a is identical to b: " + (a == b));
        Apple c = a;
        System.out.println(a + " is equal to " + c + ": " + a.equals(c));
        System.out.println("a is identical to c: " + (a == c));
    }
}


/**
 * Clone方法
 * 根据已存在的对象构造一个新的对象
 * 在根类Object 中被定义为protected，所以需要覆盖为public
 * 实现Cloneable 接口，赋予一个对象被克隆的能力(cloneability)
 * class MyObject implements Cloneable
 * {  //…
 * }
 *
 * finalize方法
 * 在对象被垃圾回收器回收之前，系统自动调用对象的finalize方法
 * 如果要覆盖finalize方法，覆盖方法的最后必须调用super.finalize
 *
 * getClass方法
 * 通过Class 对象，你可以查询Class对象的各种信息：比如它的名字，它的基类，它所实现接口的名字等。
 * void PrintClassName(Object obj) {
 *     System.out.println("The Object's class is " +
 *                        obj.getClass().getName());
 * }
 *
 * final:
 * 终结方法的特点
 * 不能被派生类覆盖
 * 终结方法存在的理由
 * 对于一些比较重要且不希望子类进行更改的方法，可以声明为终结方法。可防止子类对父类关键方法的错误重写，增加了代码的安全性和正确性
 * 提高运行效率。通常，当java运行环境（如java解释器）运行方法时，它将首先在当前类中查找该方法，接下来在其超类中查找，并一直沿类层次向上查找，直到找到该方法为止
 *
 * 抽象方法
 */
