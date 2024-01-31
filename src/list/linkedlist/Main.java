package list.linkedlist;

/*
    @author DanujaV
    @created 1/31/24 - 2:02 PM   
*/

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        /*list.add(10.5);
        list.add(10 > 5);
        list.add("Danuja");
        list.add('A');*/

        System.out.println(list);
        System.out.println("size(): " + list.size());

        Object remove = list.remove(1);
        System.out.println("remove: " + remove);

    }
}
