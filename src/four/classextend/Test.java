package four.classextend;

public class Test {
    public static void main(String args[]){
        Employee li = new Employee();
        li.name = "Li Ming";
        li.employeeNumber = 123456;
        System.out.println(li.getName());
        System.out.println(li.getEmployeeNumber());

        Manager he = new Manager();
        he.name = "He Xia";
        he.employeeNumber = 543469;
        he.responsibilities = "Internet project";
        System.out.println(he.getName());
        System.out.println(he.getEmployeeNumber());
        System.out.println(he.getResponsibilities());
    }

}

/**
 * 子类不能直接访问从父类中继承的私有属性及方法，但可使用公有（及保护）方法进行访问
 */
