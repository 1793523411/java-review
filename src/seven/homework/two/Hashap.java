package seven.homework.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Hashap {
    public static void main(String[] args) {
        // 初始化map
        Map<String, Object> map = new HashMap<String, Object>();
        for (int i = 0; i < 10; i++) {
            map.put("key" + i , i * i);
        }
        // 将键值对保存到集合,Entry将键值对的对应关系封装成了对象，即键值对对象
        List<Entry<String, Object>> lst = new ArrayList<Entry<String, Object>>(
                map.entrySet());
        // 使用集合工具来排序
        Collections.sort(lst, new Comparator<Entry<String, Object>>() {
            // 自己构造排序规则
            @Override
            public int compare(Entry<String, Object> o1,
                               Entry<String, Object> o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });


        for (Entry<String, Object> entry : lst) {
            System.out.println(entry.hashCode() + ":" + entry.getKey() + "-->"
                    + entry.getValue());
        }
    }
}


