package day29_nesteedForLoop;

public class ArraysIntro {
    public static void main(String[] args) {
        int num =10; //single variable
        int[] nums = new int[3];//int array that can store 3 numbers
        nums[0] = 5;
        nums[1] =10;
        nums[2] =7;
        System.out.println("Value at index 0 = " +nums[0]);
        System.out.println("Value at index 1 = " +nums[1]);
        System.out.println("Value at index 2 = " +nums[2]);

        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);
        //how to find out the length of an array
        System.out.println("Array size or number of element= " + nums.length);
        //Store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);
        nums[0] =100;
        nums[1]=300;
        nums[2]=50;
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);



    }
}
