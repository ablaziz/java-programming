package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(getDays().get(6));
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
       // dayNames.add("java day");
       // dayNames.removeIf(day->day.length()==6);
      //  System.out.println("Days after remove if " + dayNames);
        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n->n<90); // removes nums less than 90
        System.out.println("nums = " + nums);
    }

    public static List<String> getDays(){
        List<String> days = Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday","Sunday");
        return days;
    }
    /**
     * getRandomList
     * param: int size
     * return List<Integer>
     *     generate random numbers(0-100) the count of size, and assign to list then return
     */
    public static List<Integer> getRandomList(int size){
        Random random = new Random();// to generate random numbers
        List<Integer> randoms = new ArrayList<>();
        for(int i = 0; i<size;i++) {
         //   int n = random.nextInt();
        //    if(!randoms.contains(n)){
         //
          //  }
            randoms.add(random.nextInt(101)); // generate random number and add to list

        }
        return randoms;
    }
}
