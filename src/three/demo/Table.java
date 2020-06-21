package three.demo;

public class Table {
    public static void main(String[] args){
        /*for (int i=1; i<=9;i++) {
            for (int j=1; j<=i;j++)
                System.out.print("  "+i+"*"+j+"="+i*j);
            System.out.println();
        }*/

        outer:
        for (int i=1; i<=9;i++) {
            for (int j=1; j<=9;j++){
                if (j > i)   break;
                if (i==6)  break outer;
                System.out.print("  "+i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
        System.out.println("跳出外循环");

    }

}
