package OfficeHours.Practice_03_02_2021;

public class CountJava2 {
    public static void main(String[] args) {
        String str = "java is fun. java class today,not javascript";
        int count= 0;
        //str.substring(0,4) does this contain java?

        for(int i =0; i <str.length()-3; i++){
            String eachFourLetters = str.substring(i, i+4);
            if(eachFourLetters.equals("java")){
                count++;
            }

        }
        System.out.println(count);
    }
}
