package list;/*
    @author DanujaV
    @created 1/31/24 - 1:24 PM   
*/

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        /*numberList.add("Hello");
        numberList.add(10 > 6);*/

        List<String> nameList = new ArrayList<>();
        nameList.add("John");
        nameList.add("Sithira");
//        nameList.add(10);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer());
        /*customerList.add(10);
        customerList.add("hello");*/
    }
}
