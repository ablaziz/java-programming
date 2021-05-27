package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        //1 nanosecond = 1_000_000_000 of a second.
        long start = System.nanoTime();
       // System.out.println(System.nanoTime());
        List<Integer> millionNums = getIntegerList(); // returns ready ArrayList object. no need new
        long end = System.nanoTime();
        int[] arr= getIntegerArray();
        double second = (end-start)/1_000_000_000.0;
       // System.out.println("millionNums = " + millionNums);
        System.out.println("ArrayList time = " +(end-start));
        System.out.println("ArrayList Time in second " + second);

        long st =System.nanoTime();
        int[] aRr = getIntegerArray();
        long en = System.nanoTime();
        double seconds = (en-st)/1_000_000_000.0;
        System.out.println("Array time = " +(en-st));
        System.out.println("Array time in second= " +seconds);
    }
    /**
     * getIntegerList
     * return List<Integer>
     *     loop from 0 to 1000000
     *     and add to arraylist
     *     return
     */
    public static List<Integer> getIntegerList(){
    List<Integer> nums = new ArrayList<>();
    for(int i =0; i<=1000000; i++){
        nums.add(i);
    }
    return nums;
    }
    /**
     * getIntegerArray
     * No params
     * return int[]
     *    Loop from 0 - 1000_000
     *    and add to int[] then return it
     */
    public static int[] getIntegerArray () {
    // declare empty array with size 1000001
     int[] nums = new int[1000001];
     for(int i = 0; i<= 100000; i++) {
         nums[i]=i;
     }
     return nums;
 }

}
