package OfficeHours.Practice_03_02_2021;

public class CountUpperLowerOrNumber {
    public static void main(String[] args) {
        String str ="azizizizi";
        int upperCase=0,lowerCase=0,number=0;
        //the purpose of the loop is to check each character at the time. Also to execute many print statement.
        for(int i=0; i<str.length(); i++){
            char eachLetter = str.charAt(i);//instead of calling the method over and over again
            if (eachLetter >= 'A' && eachLetter<='Z'){
                upperCase++;
            }else if(eachLetter>= 'a' && eachLetter <= 'z'){
                lowerCase++;
            }else if(eachLetter>='0' && eachLetter <='9'){
                number++;
            }
        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("number = " + number);
    }

}
