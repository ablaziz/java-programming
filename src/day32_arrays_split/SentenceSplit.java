package day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words =sentence.split(" ");
        System.out.println("1st word is " + words[0]);
        System.out.println("2nd word is " + words[1]);
        System.out.println("3rd word is " + words[2]);
       // System.out.println("4th word " + words[3]); out of bound
        for(String word1 : words){
            System.out.println(word1);
        }
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] googleNum = googleResult.split(" ");
        System.out.println(Arrays.toString(googleNum));
        System.out.println("count" + googleNum[1]);
        System.out.println("seconds " + googleNum[3].replace("(", ""));
    }

}
