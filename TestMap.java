import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("fưerg",3);
        hashMap.put("bdu5r",6);
        hashMap.put("cerh ", 7);
        hashMap.put("afj",8);
        hashMap.put("yjluyd",9);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put(4, "tú");
        linkedHashMap.put(5,"ngọc");
        linkedHashMap.put(1,"thành");
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);
    }
}
