package day42_arrayList;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letter = new ArrayList<>();
        letter.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " +letter.size());
        System.out.println(letter);
        Collections.reverse(letter);

        System.out.println("reverse letters = " + letter);

        // how many letter a in the array
        // Collections.frequency

        System.out.println(Collections.frequency(letter,'a'));
        int vCount =Collections.frequency(letter,'v');
        System.out.println("vCount = " + vCount);

        // find the highest

        System.out.println("max char = " + Collections.max(letter));
        //  find minimum or lowest
        System.out.println("min char = " + Collections.min(letter));

        Collections.reverse(letter);
        Collections.replaceAll(letter, 'a','u');
        System.out.println("after replaceAll = " + letter);

        Collections.sort(letter);

        System.out.println("After sort " + letter);

        List<Integer> nums = Arrays.asList(23,5,87,9,4,75,15,98);
        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println("Reverse nums= " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        int countOf3 =Collections.frequency(nums,3);
        System.out.println("countOf3 = " + countOf3);

        Collections.replaceAll(nums,87,1);
        System.out.println("nums after replaceAll " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("After reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println(nums);



    }
}
