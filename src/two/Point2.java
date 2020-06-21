package two;

public class Point2 {
    private int x;
    private int y;
    public static int pointCount=0;
    public Point2(int x,int y)
    {this.x=x;this.y=y;pointCount++;}
}

class ex2_42 {
    public static void main(String[] args){
        Point2 p = new Point2(1,1);
        System.out.println(p.pointCount);
        Point2 q = new Point2(2,2);
        System.out.println(q.pointCount);
        System.out.println(p.pointCount==q.pointCount);
        System.out.println(Point2.pointCount);
    }
}