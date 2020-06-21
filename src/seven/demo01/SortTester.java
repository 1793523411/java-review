package seven.demo01;
import java.io.*;

public class SortTester {
    public static void main(String args[]){
        Student students[]=new Student[5];
        //从文件stu.ser中读出学生信息
        try {
            FileInputStream fi = new FileInputStream("/home/ygj/IdeaProjects/review2/src/seven/demo01/stu.ser");
            ObjectInputStream si = new ObjectInputStream(fi);
            for (int i=0; i<5; i++)
                students[i] = (Student)si.readObject();
            si.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        StudentClass aClass = new StudentClass("软件0201",5);
        aClass.setStudents(students);
        System.out.println(aClass);
        // 选择排序
        aClass.selectionSort();
        System.out.println("选择排序后的结果:\n");
        System.out.println(aClass);
    }

}
