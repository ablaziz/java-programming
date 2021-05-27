package day33_arrays;

import java.util.Arrays;

public class SlipReview {
    public static void main(String[] args) {
        String word ="java";
        String [] array =word.split("a");
        System.out.println(array.length);
        int countofA = array.length;
        System.out.println("countofA = " + countofA);

        String word1 = "java";
        String [] strArray= word1.split("");
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);
        System.out.println(strArray[2]);
        System.out.println(strArray[3]);

        for(int i = strArray.length; i>=0; i--);
        System.out.println();


        String word3 ="java1sql2html";
        String[] strArr2 =word3.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }


    }
}
