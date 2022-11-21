package сollectionsAssociativeArraysAndMaps;

import java.util.*;

public class HomeWork2 {

    static Map<String, List<Integer>> map = new HashMap<>();

    static Map<String,Integer> map2 = new HashMap<>();

    public static void main(String[] args) {

        Random rndm = new Random();

        map.put("String1",List.of(rndm.nextInt(1000),rndm.nextInt(1000),rndm.nextInt(1000)));
        map.put("String2",List.of(rndm.nextInt(1000),rndm.nextInt(1000),rndm.nextInt(1000)));
        map.put("String3",List.of(rndm.nextInt(1000),rndm.nextInt(1000),rndm.nextInt(1000)));
        map.put("String4",List.of(rndm.nextInt(1000),rndm.nextInt(1000),rndm.nextInt(1000)));
        map.put("String5",List.of(rndm.nextInt(1000),rndm.nextInt(1000),rndm.nextInt(1000)));

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()){
            int total = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                total+= entry.getValue().get(i);
            }
            map2.put(entry.getKey(), total);
        }

        System.out.println("map2.entrySet() = " + map2.entrySet());

        //task2 ### Задание 2

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(12, "Value1");
        linkedHashMap.put(22, "Value2");
        linkedHashMap.put(33, "Value3");
        linkedHashMap.put(14, "Value4");
        linkedHashMap.put(52, "Value5");
        linkedHashMap.put(46, "Value6");
        linkedHashMap.put(7, "Value7");
        linkedHashMap.put(13, "Value8");
        linkedHashMap.put(9, "Value9");
        linkedHashMap.put(2, "Value10");
        System.out.println("linkedHashMap.entrySet() = " + linkedHashMap.entrySet());
    }


}
