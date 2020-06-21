package two;

public class Tree {
    int height;

    Tree() {
        prt("Planting a seeding");
        height = 0;
    }

    Tree(int i) {
        prt("Creating new Tree that is " + i + " feettall");
        height = i;
    }

    void info() {
        prt("Tree is " + height + " feettall");
    }

    void info(String s) {
        prt(s + ":Tree is " + height + " feettall");
    }

    static void prt(String s) {
        System.out.println(s);
    }
}

class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
