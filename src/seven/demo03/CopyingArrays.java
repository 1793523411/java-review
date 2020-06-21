package seven.demo03;
import java.util.*;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[25];
        int[] j = new int[25];
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);
        System.arraycopy(i, 0, j, 0, i.length);
        int[] k = new int[10];
        Arrays.fill(k, 103);
        System.arraycopy(i, 0, k, 0, k.length);
        Arrays.fill(k, 103);
        System.arraycopy(k, 0, i, 0, k.length);
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u, new Integer(47));
        Arrays.fill(v, new Integer(99));
        System.arraycopy(v, 0,  u, u.length/2, v.length);
    }
}
