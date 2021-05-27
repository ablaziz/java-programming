package OfficeHours.Practice_03_02_2021.officeHours;

import java.util.Scanner;

public class PracticeFromWork {
    public static void main(String[] args) {
        String word = "it started to snow in Chicago";
        String[]eachWord = word.split(" ");
        String reverse ="";
        for(String eachWord1 :eachWord){
            for(int i = eachWord1.length()-1; i>=0; i--){
                reverse +=""+ eachWord1.charAt(i);
            }

        }
        System.out.println(reverse);
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        // DO NOT TOUCH ABOVE
        for(int i =0; i<arr.length; i=i+2){
            System.out.println(arr[i]+ ", " + arr[i+1]);
        }

    }
}


