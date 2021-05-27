package day40_arraylist;
import java.util.*;
public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        nums.size();
        
        for(int each : nums){
            System.out.println("each = " + each);
        }


        System.out.println("nums = " + nums.size());
        //reading from arraylist
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));

        System.out.println("nums = " + nums);

        //Remove a number
        nums.remove(1);
        System.out.println("nums = " + nums);


    }
    
}
