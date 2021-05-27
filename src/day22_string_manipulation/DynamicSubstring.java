package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13));
        System.out.println(result.indexOf(":"));
        int colomIndex = result.indexOf(":");
        System.out.println(result.substring(colomIndex + 1));
        //combine into one statement
        System.out.println(result.substring(result.indexOf(":")+1));

        String today = "i learned [Wooden spoon] today";
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));


    }
}
