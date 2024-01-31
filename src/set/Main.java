package set;

/*
    @author DanujaV
    @created 1/31/24 - 2:46 PM   
*/

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(34);
        set.add(1);
        set.add(576);
        set.add(54);
        set.add(395);
        set.add(54);

        System.out.println("Set: " + set);

        set.remove(2);

        System.out.println(set);

        System.out.println(set.isEmpty());


    }
}
