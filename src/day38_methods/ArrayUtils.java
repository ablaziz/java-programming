package day38_methods;

public class ArrayUtils {
    public static void main(String[] args) {

    }
    public static void  printArray(int[] nums){
        for(int num: nums){
            System.out.print(num +" ");
        }
        System.out.println();

    }
    public static int sum (int[] nums){
        int sum=0;
        for(int num:nums){
            sum += num;

        }
        return sum;
    }

    public static boolean contains(int[] nums, int num){
        for(int eachNum : nums){
            if(eachNum==num){
                return true;
            }
        }
        return false;
    }
}
