package seven.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class People {
    String name;
    Birth birth;
    Sex s;
    float height;
    float weight;

    People(String name, Birth birth, Sex s, float height, float weight) {
        this.name = name;
        this.birth = birth;
        this.s = s;
        this.height = height;

        this.weight = weight;
    }

    public String toString() {
        return this.name  +' '+'\t'+' ' + this.birth.toString()  +' '+'\t'+' ' + this.s +' '+'\t' +' '+ this.height+"米"  +' '+'\t'+' ' + this.weight+"千克" + '\t';
    }

    // public static float suiji = new Random().nextInt(2);
    public static int suiji2 = new Random().nextInt(30);

    public static void main(String[] args) throws IOException {
        String name;
        Birth birth;
        Sex s;
        float height;
        float weight;
        People people[] = new People[10];
//        FileWriter w = new FileWriter();
        String path = Thread.currentThread().getContextClassLoader().getResource("data.txt").getPath();
        System.out.println(path);
        File file = new File(path);
        FileOutputStream outputStream = new FileOutputStream(file,true);
        for (int i = 0; i < 10; i++) {
            Random Random = new Random();
            Random Random2 = new Random();
             float suiji = Random.nextInt(50);
            int suiji2 = Random2.nextInt(200);
            name = "prople0" + i;
            birth = new Birth(1990+suiji2%12, suiji2 % 12+1, suiji2 % 29+1);
            s = suiji2 % 2 == 0 ? Sex.BOY : Sex.GIRL;
            height = (float)(suiji+150)/100;
            weight = suiji+40;
            People people01 = new People(name, birth, s, height, weight);

            people[i] = people01;
        }
        System.out.println();
        String data = "\n名字    " + '\t' + "   出生日期      " + '\t' + "  性别    " + '\t' + "  身高      " + '\t' + "    体重      " + '\t'+'\n'+"------------------------------------------------------------------\n";
        outputStream.write(data.getBytes());
        for (int i = 0; i < 10; i++) {
//            System.out.println(people[i].toString()+"\n");
            data = people[i].toString()+"\n";
            outputStream.write(data.getBytes());
        }
        outputStream.close();
    }
}
