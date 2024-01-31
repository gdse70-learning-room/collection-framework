package set.hashset;

/*
    @author DanujaV
    @created 1/31/24 - 2:46 PM   
*/

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set);

        set.remove(2);

        System.out.println(set);

        System.out.println(set.isEmpty());
    }
}
