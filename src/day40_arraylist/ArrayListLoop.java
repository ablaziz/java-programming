package day40_arraylist;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>(); // polymorphic way of declaring arrayList
        System.out.println(nums);
        nums.add(12);
        nums.add(34);
        nums.add(56);
        nums.add(78);
        nums.add(9);


     //   for(int each : nums){
     //       System.out.println(each);
      //  }
        System.out.println(nums);
        nums.remove(4);
        System.out.println(nums);
        nums.remove(new Integer(78));
        System.out.println(nums);
        nums.add(69); nums.add(2); nums.add(963);
        System.out.println(nums);
        System.out.println(nums.size());

        for(int i=0; i< nums.size(); i++){
            System.out.println(nums.get(i)+" ");

        }
        for(int each : nums){
            System.out.println("each = " + each);
        }
    }
}
