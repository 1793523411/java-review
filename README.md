# java期末考试复习
 **注：这里的代码完全是在期末考试前照着课件所写，仅仅针对期末考试，深度尚且不够，许多概念只是粗浅的展示了一下，所以大佬请出门左拐，避免您口吐芬芳**
 
 越往后讲的越浅，哈哈哈，看来想学好java还得自学，👻所以再次声明，该份代码仅适合面对期末考试和熟悉java基础
 
 大致目录如下：
 
 ```
 2.类与对象的基本概念   
     2.1 面向对象的程序设计方法概述
     2.2 类与对象 
     2.3 对象初始化和回收 
     2.4 应用举例 
     2.5 本章小节
 3.类的方法
     3.1 方法的控制流程
     3.2 异常处理简介
     3.3 方法的重载(overloading)
     3.4 本章小结
 4.类的重用
     4.1 类的继承
     4.2 Object类 
     4.3 终结类与终结方法
     4.4 抽象类
     4.5 类的组合 
     4.6 包的应用
     4.7 本章小结
 5.接口与多态
    5.1 接口
    5.2 塑型
    5.3 多态的概念
    5.4 多态的应用
    5.5 构造方法与多态
    5.6 本章小结
 6.输入输出流和文件
    6.1 输入/输出流
    6.2 文件读写
    6.3 本章小结
 7.对象群体的组织
    7.1 对象数组
    7.2 集合（Collection, Map）
    7.3 本章小结
 8.线程
    多线程编程基础
    线程的生命周期
    线程的优先级
    本章小结
 9.GUI
    Java Swing概述
    窗口
    常用组件与布局
    处理事件
    使用MVC结构
    对话框
    发布GUI程序
 10.JDBC
 11.网络编程
```
 **(原谅我的这样的命名方式，人家还很菜)**
 ```shell
└── src
    ├── eight
    │   ├── demo01
    │   ├── demo02
    │   ├── demo03
    │   ├── demo04
    │   ├── demo05
    │   ├── demo06
    │   ├── demo07
    │   ├── demo08
    │   ├── demo09
    │   ├── demo10
    │   ├── demo11
    │   ├── demo12
    │   ├── demo13
    │   └── homework
    ├── eleven
    ├── five
    │   ├── demo01
    │   ├── demo02
    │   ├── demo03
    │   ├── demo04
    │   ├── demo05
    │   ├── demo06
    │   ├── demo07
    │   ├── demo08
    │   └── demo09
    ├── four
    │   ├── classextend
    │   ├── equals
    │   ├── has
    │   ├── hidden
    │   └── other
    ├── nine
    │   └── homework
    ├── seven
    │   ├── demo01
    │   ├── demo02
    │   ├── demo03
    │   ├── demo04
    │   ├── demo05
    │   └── homework
    │       └── two
    ├── six
    │   ├── demo01
    │   ├── demo02
    │   ├── demo03
    │   ├── demo04
    │   ├── demo05
    │   ├── demo06
    │   └── homework
    ├── ten
    ├── three
    │   ├── demo
    │   │   └── overload
    │   └── homework
    └── two
        └── Patient
```

更详细的结构

```$xslt
└── src
    ├── eight
    │   ├── demo01
    │   │   ├── FactorialThread.java
    │   │   └── Test.java
    │   ├── demo02
    │   │   ├── Test.java
    │   │   └── TestThread.java
    │   ├── demo03
    │   │   ├── FactorialThread.java
    │   │   └── Test.java
    │   ├── demo04
    │   │   ├── Test.java
    │   │   └── TestThread.java
    │   ├── demo05
    │   │   ├── Test.java
    │   │   └── TestThread.java
    │   ├── demo06
    │   │   ├── SellTickets.java
    │   │   └── Test.java
    │   ├── demo07
    │   │   ├── Consumer.java
    │   │   ├── Producer.java
    │   │   └── Test.java
    │   ├── demo08
    │   │   ├── Consumer.java
    │   │   ├── Producer.java
    │   │   └── Test.java
    │   ├── demo09
    │   │   ├── Consumer.java
    │   │   ├── Producer.java
    │   │   └── Test.java
    │   ├── demo10
    │   │   └── Test.java
    │   ├── demo11
    │   │   ├── Player0.java
    │   │   ├── Player1.java
    │   │   ├── Player2.java
    │   │   └── Test.java
    │   ├── demo12
    │   │   ├── Test.java
    │   │   └── TestThread.java
    │   ├── demo13
    │   │   ├── Test.java
    │   │   └── TestThread.java
    │   └── homework
    │       ├── 2020-06-04 21-51-39 的屏幕截图.png
    │       ├── 2020-06-04 21-52-13 的屏幕截图.png
    │       ├── TestRunnable.java
    │       ├── TestThread.java
    │       └── 线程与进程区别.txt
    ├── eleven
    │   ├── TestUDPClient.java
    │   └── TestUDPServer.java
    ├── five
    │   ├── demo01
    │   │   ├── Car.java
    │   │   ├── Circle.java
    │   │   ├── Insurable.java
    │   │   ├── InterfaceTester.java
    │   │   ├── Rectangle.java
    │   │   ├── Shape2D.java
    │   │   └── VaruableTester.java
    │   ├── demo02
    │   │   ├── Company.java
    │   │   ├── MovableObject.java
    │   │   └── Plane.java
    │   ├── demo03
    │   │   ├── Circle.java
    │   │   ├── Color.java
    │   │   ├── MultilnterfaceTester.java
    │   │   └── Shape2D.java
    │   ├── demo04
    │   │   ├── Circle.java
    │   │   ├── ExtendsInterfaceTester.java
    │   │   ├── Shape2D.java
    │   │   └── Shape.java
    │   ├── demo05
    │   │   ├── BindingTester.java
    │   │   ├── Circle.java
    │   │   ├── Shape.java
    │   │   ├── Square.java
    │   │   └── Triangle.java
    │   ├── demo06
    │   │   ├── Instrument.java
    │   │   ├── Music.java
    │   │   ├── Note.java
    │   │   └── Wind.java
    │   ├── demo07
    │   │   ├── Driver.java
    │   │   ├── FemaleDriver.java
    │   │   ├── MaleDriver.java
    │   │   └── Test.java
    │   ├── demo08
    │   │   ├── Ball.java
    │   │   ├── MovingBall.java
    │   │   ├── Point.java
    │   │   └── Tester.java
    │   └── demo09
    │       ├── Bread.java
    │       ├── Cheese.java
    │       ├── Lettuce.java
    │       ├── Lunch.java
    │       ├── Meal.java
    │       ├── PortableLunch.java
    │       └── Sandwich.java
    ├── four
    │   ├── classextend
    │   │   ├── Employee.java
    │   │   ├── Manager.java
    │   │   ├── Person.java
    │   │   └── Test.java
    │   ├── equals
    │   │   ├── Apple.java
    │   │   └── Test.java
    │   ├── has
    │   │   ├── Custom.java
    │   │   ├── DinnerPlate.java
    │   │   ├── Fork.java
    │   │   ├── Knife.java
    │   │   ├── PlaceSetting.java
    │   │   ├── Plate.java
    │   │   ├── Spoon.java
    │   │   └── Utensil.java
    │   ├── hidden
    │   │   ├── A1.java
    │   │   ├── B1.java
    │   │   └── Test.java
    │   └── other
    │       ├── StringEditor.java
    │       └── StringEditorTester.java
    ├── nine
    │   └── homework
    │       └── Wenben.java
    ├── seven
    │   ├── demo01
    │   │   ├── SortTester.java
    │   │   ├── StudentClass.java
    │   │   ├── Student.java
    │   │   ├── stu.ser
    │   │   └── Test.java
    │   ├── demo02
    │   │   └── SortedIntArray.java
    │   ├── demo03
    │   │   ├── ComparingArrays.java
    │   │   └── CopyingArrays.java
    │   ├── demo04
    │   │   ├── EnumerationTester2.java
    │   │   ├── EnumerationTester.java
    │   │   └── IteratorTester.java
    │   ├── demo05
    │   │   ├── Movie.java
    │   │   ├── MovieStore.java
    │   │   └── MovieStoreTester.java
    │   └── homework
    │       ├── Birth.java
    │       ├── data.txt
    │       ├── People.java
    │       ├── Sex.java
    │       └── two
    │           ├── coll.java
    │           └── Hashap.java
    ├── six
    │   ├── demo01
    │   │   ├── Hello2.txt
    │   │   ├── Hello.txt
    │   │   ├── WriteText2.java
    │   │   └── WriteText.java
    │   ├── demo02
    │   │   ├── BufferedWrite.java
    │   │   ├── BufferReader.java
    │   │   └── newHello.txt
    │   ├── demo03
    │   │   ├── 1.txt
    │   │   ├── 2.txt
    │   │   ├── CopyMaker.java
    │   │   └── Test.java
    │   ├── demo04
    │   │   ├── 1.txt
    │   │   ├── 2.txt
    │   │   └── NewCopyBytes.java
    │   ├── demo05
    │   │   ├── book.dat
    │   │   ├── Book.java
    │   │   └── Test.java
    │   ├── demo06
    │   │   ├── Blip3.java
    │   │   └── Blip3.out
    │   └── homework
    │       ├── Ex6_7.java
    │       ├── RandomNum.java
    │       ├── Random.txt
    │       ├── test02.txt
    │       └── test03.txt
    ├── ten
    │   ├── Test01.java
    │   ├── Test02.java
    │   └── 说明.txt
    ├── three
    │   ├── demo
    │   │   ├── Continue.java
    │   │   ├── Erroe02.java
    │   │   ├── Error01.java
    │   │   ├── Input.java
    │   │   ├── overload
    │   │   │   ├── MethodOverloading.java
    │   │   │   └── Test.java
    │   │   ├── Source.java
    │   │   ├── Table.java
    │   │   └── Year.java
    │   └── homework
    │       ├── Compare.java
    │       └── Factorial.java
    └── two
        ├── AccountTestr2.java
        ├── Address.java
        ├── BankAccount2.java
        ├── ex2_4.java
        ├── hello.java
        ├── Patient
        │   ├── Patient.java
        │   ├── Test02.java
        │   └── Test.java
        ├── Point2.java
        ├── Point.java
        ├── Tree.java
        └── 垃圾回收.txt

```