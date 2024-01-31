package list.arraylist;/*
    @author DanujaV
    @created 1/31/24 - 12:11 PM   
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();

        System.out.println("isEmpty(): " + list.isEmpty());

        list.add(10);
        list.add(10.5);
        list.add(10 > 5);
        list.add("Danuja");
        list.add('A');

        System.out.println("isEmpty(): " + list.isEmpty());
        System.out.println(list);

        System.out.println("size(): " + list.size());

        boolean isRemoved = list.remove("Danuja");   //false
        System.out.println("isRemoved: " + isRemoved);

        System.out.println("size(): " + list.size());
        System.out.println(list);

        Object remove = list.remove(1);
        System.out.println("removed: " + remove);
        System.out.println("size(): " + list.size());
        System.out.println(list);

        list.add(1, "Saman");
        System.out.println(list);
    }
}
