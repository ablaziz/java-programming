package day31_arrays;
import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int [] nums = {5 , 1, 7, 0, 50, -3, 9, 63, 100};
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);
        System.out.println(nums[nums.length-1]);

        String[] words ={"java", "c#", "c++", "kotlin", "python", "ruby", "assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(" ",  words)+ "]");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // sort to reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println();
    }
}
