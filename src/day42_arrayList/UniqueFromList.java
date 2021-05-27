package day42_arrayList;
import java.util.*;
public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6));
        System.out.println("nums = " + nums);
        List<Integer> uniqueList = getUniqueIntegers(nums);
        System.out.println("\nUniqueList = " + uniqueList);
    }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
        List<Integer> uniqueList = new ArrayList<>();
        for(int each: nums){
            // Check if number appear only once
            if(Collections.frequency(nums, each)==1){
                System.out.print(each);
                uniqueList.add(each);
            }


        }
        return uniqueList;
    }
}
