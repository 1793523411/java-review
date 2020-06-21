package Patient;

public class Test02 {

    public static void main(String[] args){
        Patient test01 = new Patient();

        test01.setName("test01");
        test01.setSex('m');
        test01.setAge(20);
        test01.setWeight(120.36f);
        test01.setAllergies(true);

        System.out.println(test01.toString());
    }
}
