package day62_collections;
import java.util.*;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(33);
        scores.add(33);

        System.out.println(scores);
        System.out.println(scores.get(0));
        System.out.println(scores.get(1));

        list.add("Aziz");
        list.add("Nour");
        list.add("sarah");
        list.addFirst("john");
        System.out.println(list);
    }
}
