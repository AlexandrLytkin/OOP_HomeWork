package сollectionsAssociativeArraysAndMaps;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Ivanov Ivan Ivanovich", "+79047657601");
        map.put("Sidorov Ilya Ivanovich", "+7903754302");
        map.put("Petrov Nikolay Ivanovich", "+79080213403");
        map.put("Alexandrov Ivan Ivanovich", "+79080213404");
        map.put("Semenov Nikita Ivanovich", "+79080213405");
        map.put("Medvedev Ivan Ivanovich", "+79080276406");
        map.put("Babiy Oleg Ivanovich", "+74080213407");
        map.put("KIyachko Yriy Ivanovich", "+79077213408");
        map.put("Kashey Bones Underyearovich", "+70780453409");
        map.put("Yaga Stupa Forestovna", "+79098983410");
        map.put("Klon Ivan Ivanovich", "+79780612411");
        map.put("Tourist Ivan Ivanovich", "+79083213412");
        map.put("Gem Ivan Ivanovich", "+79080915413");
        map.put("Dev Ivan Ivanovich", "+79050215414");
        map.put("Bach Ivan Ivanovich", "+79040819415");
        map.put("Each Ivan Ivanovich", "+79680213416");
        map.put("Mashinin Ivan Ivanovich", "+79850618417");
        map.put("Razmerov Ivan Ivanovich", "+79380213418");
        map.put("Malysh Ivan Ivanovich", "+79160116419");
        map.put("Biw Ivan Ivanovich", "+79080212420");

        System.out.println("map.size() = " + map.size());
        System.out.println("map.values() = " + map.values());
        System.out.println("map.keySet() = " + map.keySet());

    }
}
