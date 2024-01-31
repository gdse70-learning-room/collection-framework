package set.hashset;

/*
    @author DanujaV
    @created 1/31/24 - 2:49 PM   
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(1);
        list.add(576);
        list.add(54);
        list.add(395);
        list.add(54);

        System.out.println("List: " + list);

        Set<Integer> set = new HashSet<>();
        set.add(34);
        set.add(1);
        set.add(576);
        set.add(54);
        set.add(395);
        set.add(54);

        System.out.println("Set: " + set);
    }
}
