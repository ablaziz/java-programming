package day42_arrayList;
import java.util.*;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
      // declare stringArraylist then add value
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium"); words.add("a"); words.add("input"); words.add("title");
        //pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br","python", "sql", "api"));

        List<Integer> nums = Arrays.asList(23, 54, 23, 566, 45, 9,145 );
        int sum =sumIntegerList(nums);
        System.out.println("sum = " + sum);

    }

    /**
     methodName: printStrList
     param: list of Strings
     return: void
     print all values separated by space in same line
     */

    public static void printStrList(List<String> stringList){ // "java' "apple", "coffee", "tea" (we are imagining)
        for(String str: stringList){
            System.out.print(str +" ");
        }
        System.out.println();

    }
    /**
     methodName: sumIntegerList
     param: list of Integers
     return: int
     calculate sum of integers in the list then return
     */
    public static int sumIntegerList(List<Integer> list) {
        int sum =0;
        for(int i : list){
            sum+=i;
        }
        return sum;
    }

}




