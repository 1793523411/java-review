package two;

public class ex2_4 {
    public static void main(String[] args){
        Point p = new Point(1,1);
        System.out.println(p.pointCount);
        Point q = new Point(2,2);
        System.out.println(q.pointCount);
        System.out.println(p.pointCount==q.pointCount);
        System.out.println(Point.pointCount);
    }
}
