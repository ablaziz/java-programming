package java_home_work;

import java.util.Arrays;

public class New {
    public static void main(String[] args) {

    }
public static boolean isArmstrong(int num){
        String strNum ="" + num;
        int power = strNum.length();
        int sum = 0;

        for(int i = 0; i<strNum.length(); i++){
            int eachDigit = Integer.parseInt((strNum.substring(i,i+1)));
            sum+= Math.pow(eachDigit,power);
        }
        return num==sum;

}

}
