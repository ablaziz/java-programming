package day31_arrays;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int nums [] = {23, 126, 255, 369,689, 900};
        System.out.println(Arrays.binarySearch(nums, 23));
        System.out.println(Arrays.binarySearch(nums, 689));
        System.out.println(Arrays.binarySearch(nums, 25));
        System.out.println(Arrays.binarySearch(nums, 500));
        System.out.println(Arrays.binarySearch(nums, 1000));
        //check if 12345 is among numbers in array
        if(Arrays.binarySearch(nums, 12345) >=0){
            System.out.println("is among");
        }else{
            System.out.println("is not among");
        }
    }
}
