package map;

/*
    @author DanujaV
    @created 1/31/24 - 3:12 PM   
*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap<>();  //key value pairing system
//        map.add(10);

        map.put("sl", "Kotte");
        map.put("uk", "London");
        map.put("aus", "Melbourne");

        System.out.println(map);
    }
}
