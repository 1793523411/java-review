package seven.demo01;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student students[];
        StudentClass aClass = new StudentClass("软件0201", 5);
        students = new Student[5];
        for (int i = 0; i < 5; i++)
            students[i] = new Student(getAStudent(i + 1));
        aClass.setStudents(students);
        System.out.println(aClass);
        try {
            FileOutputStream fo = new FileOutputStream("/home/ygj/IdeaProjects/review2/src/seven/demo01/stu.ser");
            ObjectOutputStream so = new ObjectOutputStream(fo);
            for (int i = 0; i < 5; i++)
                so.writeObject(students[i]);
            so.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static Student getAStudent(int i){
        Student studenti;
        System.out.println("输入第" + i + "个学生的信息:");
        String id,name;
        int eng,math,comp;
        Scanner sc=new Scanner(System.in);                        System.out.println("学号:");       id=sc.nextLine();
        System.out.println("姓名:");
        name=sc.nextLine();
        System.out.println("英语成绩:");
        eng=sc.nextInt();
        System.out.println("数学成绩:");
        math=sc.nextInt();
        System.out.println("计算机成绩:");             comp=sc.nextInt();
        studenti = new Student(id,name,eng,math,comp);
        return studenti;
    }
}
