package OfficeHours.Practice_03_02_2021.officeHours;

import java.util.Scanner;

public class PracticeWithAndrey {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
        String container ="";
        for(String each: words){
            if(each.length()>container.length())
            container=each;
        }

        //write your code below



        System.out.println(container);
    }

}

