package set;

/*
    @author DanujaV
    @created 1/31/24 - 2:58 PM   
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(34);
        set1.add(1);
        set1.add(576);
        set1.add(54);
        set1.add(395);
        set1.add(54);

        System.out.println("HashSet: " + set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(34);
        set2.add(1);
        set2.add(576);
        set2.add(54);
        set2.add(395);
        set2.add(54);

        System.out.println("LinkedhashSet: " + set2);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(34);
        set3.add(1);
        set3.add(576);
        set3.add(54);
        set3.add(395);
        set3.add(54);

        System.out.println("TreeSet: " + set3);
    }
}
