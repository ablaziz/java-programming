package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums ={5,6,98,8};
        ArrayUtils.printArray(nums);
       // ArrayUtils.printArray(new int[]{5,98,89,37,987,354,756});
        System.out.println("sum= " + ArrayUtils.sum(nums));
        System.out.println("sum = " +ArrayUtils.sum(new int[]{5,6,98,8}));

        int[]nums2 ={3,5,8,10,98};
        System.out.println("contains =" + ArrayUtils.contains(nums2, 2));

    }
}
