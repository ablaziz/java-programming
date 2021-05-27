package day31_arrays;
import java.util.*;
public class charArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for(char eachLetter :letters){
            System.out.print(eachLetter + "");
        }
    String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char [] itemArray=item.toCharArray();
        System.out.println("itemArray.lengh = " + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String [] fruits ={"bananas", "apples", "kiwi", "mango","papaya","strawberry"};
        String fruitStr="";
        for(String eachFruits:fruits){
            System.out.print(eachFruits + "-");
            fruitStr +=eachFruits + "-";

        }
        System.out.println("\nFruitStr = " + fruitStr);

        String [] languages = {"java", "python", "c++","ruby","javascript"};
        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        System.out.println(String.join("<>",languages));
    }
}
