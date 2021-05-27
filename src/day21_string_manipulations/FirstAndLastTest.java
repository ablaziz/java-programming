package day21_string_manipulations;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if(first==last){
            System.out.println("first and last match");
        }else{
            System.out.println("first and last mismatch");
        }
        if(word.charAt(0)==word.charAt(2)){
            System.out.println("first and last match");
        }else{
            System.out.println("first and last mismatch");
        }
        String name = "aziz";
        char firstletter = name.charAt(0);
        char lastletter = name.charAt(name.length() -1);
        System.out.println(firstletter);
        System.out.println(lastletter);
        if(firstletter==lastletter){
            System.out.println(name + " - first and last name match");
        }else{
            System.out.println("first and last name mismatch");
        }
    }
}
