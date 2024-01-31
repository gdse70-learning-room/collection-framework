package map;

/*
    @author DanujaV
    @created 1/31/24 - 3:12 PM   
*/

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Gayumi", 70);
        map.put("Sanduni", 65);

        System.out.println(map);

        Map<Integer, Double> map2 = new HashMap<>();
        map2.put(1, 70.5);
        map2.put(2, 43.5);
        map2.put(1, 100.5);
        System.out.println(map2);
    }
}
