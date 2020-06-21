package five.demo03;

class Circle implements Shape2D,Color   // 实现Circle类
{
    double radius;
    String color;
    public Circle(double r)             //构造方法
    {
        radius=r;
    }
    public double area()                //定义area()的处理方式
    {
        return (pi*radius*radius);
    }
    public void setColor(String str)  //定义setColor()的处理方式
    {
        color=str;
        System.out.println("color="+color);
    }

//    @Override
//    public void setColor() {
//
//    }
}

