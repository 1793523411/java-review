package six.demo06;
import java.io.*;
import java.util.*;

public class Blip3 implements Externalizable{
    int i;
    String s;
    public Blip3() {   System.out.println("Blip3 Constructor"); }
    public Blip3(String x, int a) {
        System.out.println("Blip3(String x, int a)");
        s = x;
        i = a;
    }
    public String toString() { return s + i; }
    public void writeExternal(ObjectOutput out) throws IOException{
        System.out.println("Blip3.writeExternal");
        // You must do this:
        out.writeObject(s);
        out.writeInt(i);
    }

    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {
        System.out.println("Blip3.readExternal");
        // You must do this:
        s = (String)in.readObject();
        i =in.readInt();
    }
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        System.out.println("Constructing objects:");
        Blip3 b3 = new Blip3("A String ", 47);
        System.out.println(b3);
        System.out.println("----------------");
        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("/home/ygj/IdeaProjects/review2/src/six/demo06/Blip3.out"));
        System.out.println("Saving object:");
        o.writeObject(b3);
        o.close();
        // Now get it back:
        ObjectInputStream in =  new ObjectInputStream(
                new FileInputStream("/home/ygj/IdeaProjects/review2/src/six/demo06/Blip3.out"));
        System.out.println("Recovering b3:");
        b3 = (Blip3)in.readObject();
        System.out.println(b3);
    }
}

/**
 * Externalizable 接口
 * 实现该接口可以控制对象的读写
 * API中的说明为
 * public interface Externalizable extends Serializable
 * 其中有两个方法writeExternal()和readExternal()，因此实现该接口的类必须实现这两个方法
 * ObjectOutputStream的writeObject()方法只写入对象的标识，然后调用对象所属类的writeExternal()
 * ObjectInputStream的readObject()方法调用对象所属类的readExternal()
 */
