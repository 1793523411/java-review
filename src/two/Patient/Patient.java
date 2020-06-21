package Patient;

public class Patient {
    private String name;
    private char sex;
    private int age;
    private float weight;
    private boolean allergies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isAllergies() {
        return allergies;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    public static void main(String[] args){

    }
    public String toString(){
        return "name:" + name + "\nsex:" + sex + "\nage" + age + "\nweight:" + weight + "\nallergies:" + allergies;
    }
}
