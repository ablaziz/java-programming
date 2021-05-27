package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
        //System.out.println(word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + "" +word.charAt(0));
        System.out.println("" +word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));
        String reverse = (word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + "" +word.charAt(0));
        System.out.println("reverse = " + reverse);
        System.out.println("word = " + word);
         if (word.equalsIgnoreCase(reverse)){
             System.out.println("Palindrome word");
         }else{
             System.out.println("not palindrome word");
         }
    }
}
