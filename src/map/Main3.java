package map;

/*
    @author DanujaV
    @created 1/31/24 - 3:12 PM   
*/

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();

        map1.put("sl", "Kotte");
        map1.put("uk", "London");
        map1.put("aus", "Melbourne");

        System.out.println("HashMap: " + map1);

        Map<String, String> map2 = new TreeMap<>();

        map2.put("sl", "Kotte");
        map2.put("uk", "London");
        map2.put("aus", "Melbourne");

        System.out.println("TreeMap: " + map2);

        Map<String, String> map3 = new LinkedHashMap<>();

        map3.put("sl", "Kotte");
        map3.put("uk", "London");
        map3.put("aus", "Melbourne");

        System.out.println("LinkedHashMap: " + map3);

        Map<String, String> map4 = new Hashtable<>();

        map4.put("sl", "Kotte");
        map4.put("uk", "London");
        map4.put("aus", "Melbourne");

        System.out.println("HashTable: " + map4);
    }
}
