package day32_arrays_split;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {
        String words= "java,selenium,python,html";
        String [] wordArrays =words.split(",");
        System.out.println(Arrays.toString(wordArrays));
        System.out.println("length of array = " +wordArrays.length);
        String sentence = "life is the real college in life";
        for(String each : wordArrays){
            System.out.println(each);
        }
        String sentence1 = "life is the real college in life";
        String [] sentence1Array = sentence1.split(" ");
        System.out.println(sentence1Array[0]);
        System.out.println(sentence1.split(" ")[0]);
        System.out.println("Number of word in sentence1 = " + sentence1Array.length);

        for(String eachWord :sentence1Array){
            System.out.println(eachWord);
        }
    }
}
