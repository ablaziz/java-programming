package day62_collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        Collection <String> schools = new ArrayList<>();

        cities.add("Alexandria");
        cities.add("McLean");
        cities.add("Vienna");

        System.out.println(cities);
        System.out.println("first city: " + cities.get(0));
        System.out.println("count of cities = " + cities.size());

    }
}
