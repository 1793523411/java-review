package four.other;

public class StringEditorTester {
    public static void main(String args[]) {
        String original = "Hello123, My Name is Mark, 234I think you are my classmate?!!";
        System.out.println(
                StringEditor.removeNonLetters(original));
    }
}

/**
 * System类
 * 访问系统资源
 * arraycopy()              复制一个数组
 * exit()                         结束当前运行的程序
 * currentTimeMillis()   获得系统当前日期和时间等
 * 访问标准输入输出流
 * System.in         标准输入，表示键盘
 * System.out       标准输出，表示显示器
 * Runtime类
 * 可直接访问运行时资源
 * totalMemory()   返回系统内存总量
 * freeMemory()   返回内存的剩余空间
 *
 * 实用包(java.util)——实现各种不同实用功能
 * 日期类：描述日期和时间
 * Date
 * Calendar
 * GregorianCalendar
 * 集合类
 * Collection（无序集合）、Set（不重复集合）
 * List（有序不重复集合）、Enumeration（枚举）
 * LinkedList（链表）、Vector（向量）
 * Stack（栈）、Hashtable（散列表）、TreeSet（树）
 * StringTokenizer类
 * 允许以某种分隔标准将字符串分隔成单独的子字符串
 *
 * Date类
 * 构造方法
 * Date()     获得系统当前日期和时间值。
 * Date(long date)  以date创建日期对象，date表示从GMT（格林威治）时间1970-1-1 00:00:00开始至某时刻的毫秒数
 * 常用方法
 * getTime()
 * 返回一个长整型表示时间，单位为毫秒（millisecond）
 * after(Date d)
 * 返回接收者表示的日期是否在给定的日期之后
 * before(Date d)
 * 返回接收者表示的日期是否在给定的日期之前
 *
 * Calendar类
 * 一个抽象的基础类，支持将Date对象转换成一系列单个的日期整型数据集，如YEAR、MONTH、DAY、HOUR等常量
 * 它派生的GregorianCalendar类实现标准的Gregorian日历
 * 由于Calendar是抽象类，不能用new方法生成Calendar的实例对象，可以使用getInstance()方法创建一个GregorianCalendar类的对象
 * Calendar类中声明的常量
 * Calendar.SUNDAY
 * Calendar.MONDAY
 * Calendar.TUESDAY
 * Calendar.SATURDAY
 * Calendar.JANUARY
 * Calendar.FEBRUARY
 * Calendar.AM
 * ...
 */

