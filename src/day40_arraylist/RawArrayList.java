package day40_arraylist;

import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        // declare raw arraylist
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();
        // By default arrayList capacity is 10

        list1.add("java");
        list1.add("apples");
        list1.add(1235);
        list1.add(55.2);
        list1.add(true);
        list1.add('A');
        list1.add("coffee");
        System.out.println(list1);
        System.out.println(list1.size());



    }
}
