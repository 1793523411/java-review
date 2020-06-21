package seven.homework.two;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class coll {
    String name;
    String hobby;

    public coll(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public static void main(String[] args) {
        coll per01 = new coll("ygj","aaa");
        coll per02 = new coll("ygj02","bbb");
        coll per03 = new coll("ygj03","ccc");
        coll per04 = new coll("ygj04","ddd");
        Collection per = new HashSet();
        per.add(per01);
        per.add(per02);
        per.add(per03);
        per.add(per04);
        Iterator it = per.iterator();
        while(it.hasNext()){
            coll tem= (coll)it.next();
            System.out.println(tem.hashCode()+"---"+tem.name+"---"+tem.hobby);
        }
    }
}