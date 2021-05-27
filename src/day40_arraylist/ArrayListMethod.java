package day40_arraylist;
import java.util.*;
public class ArrayListMethod {
    public static void main(String[] args) {
        List<String> shoppingList =new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("is empty = " + shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("You got a lot of shopping to do");
        }else {
            System.out.println("list is not empty: code java");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden Spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        if(shoppingList.isEmpty()){
            System.out.println("You got a lot of shopping to do");
        }else {
            System.out.println("list is not empty: code java");
        }
        int count = shoppingList.size();
        System.out.println("item to by = " +count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes")); //case sensitive
        if(shoppingList.contains("shoes")){
            System.out.println("shoes is in the list");
        }else{
            System.out.println("shoes is not in the list");
        }
        shoppingList.remove("shoes");
        System.out.println("Shopping list " + shoppingList);

        shoppingList.clear();
        System.out.println(shoppingList);
    }
}
