package сollectionsAssociativeArraysAndMaps;

import java.util.HashMap;
import java.util.Map;

public class CollectionsAssociativeArraysAndMaps {
    static Map<String, Integer> map = new HashMap<>();



    public static void main(String[] args) {
        map.put("человек", 1);
        map.put("обезьяна", 2);
        map.put("шимпанзе", 1);
        map.put("макака", 1);
        map.put("гибон", 3);
        map.put("гибон", 2);
        addPut("человек",12);
        addPut("жаба",3);
        System.out.println("map.entrySet() = " + map.entrySet());
        System.out.println("map.containsKey() = " + map.containsKey("чело123век"));

    }

    public static void addPut( String key,  Integer value) {
            if (map.containsValue(value) && map.containsKey(key)) {
                throw new RuntimeException("этот String уже есть! "+ key);
            } else {
                map.put(key, value);
            }
    }

}


