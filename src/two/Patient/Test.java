package Patient;

public class Test {
    public static void main(String[] args){
        Patient test01 = new Patient();
        Patient test02 = new Patient();

        test01.setName("test01");
        test01.setSex('m');
        test01.setAge(20);
        test01.setWeight(120.36f);
        test01.setAllergies(true);

        test02.setName("test02");
        test02.setSex('w');
        test02.setAge(19);
        test02.setWeight(98.36f);
        test02.setAllergies(false);

        System.out.println("Name:"+ test01.getName());
        System.out.println("Sex:"+test01.getSex());
        System.out.println("Age:"+test01.getAge());
        System.out.println("Weight:"+test01.getWeight());
        System.out.println("Allergies:"+test01.isAllergies()+"\n\n");

        System.out.println("Name:"+ test02.getName());
        System.out.println("Sex:"+test02.getSex());
        System.out.println("Age:"+test02.getAge());
        System.out.println("Weight:"+test02.getWeight());
        System.out.println("Allergies:"+test02.isAllergies());
    }
}
