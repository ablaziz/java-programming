package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("Aziz is capable",10,'|'));
    }
    public static String repeatString(String word,int times, char delimiter){
        String returnValue ="";
        for(int i=1; i<= times; i++){
            if(i==times){
                returnValue += word;
            }else {
                returnValue += word+delimiter;
            }


        }
        return returnValue;
    }
}
