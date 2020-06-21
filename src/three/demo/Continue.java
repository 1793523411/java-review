package three.demo;

public class Continue {
    public static void main(String args[]) {
        outer:
        for (int i = 1; i < 10; i++) {
            inner:
            for (int j = 1; j < 10; j++) {
                if (i < j) {
                    System.out.println();
                    continue outer;
                }
                System.out.print("  " + i + "*" + j + "=" + i * j);
            }
        }

    }
}
