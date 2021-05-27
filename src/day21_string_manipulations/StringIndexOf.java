package day21_string_manipulations;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "github bread is good bread ";
        System.out.println(word.indexOf("g"));
        System.out.println(word.indexOf("h"));
        System.out.println(word.indexOf("hub"));
        System.out.println(word.indexOf("b"));
        System.out.println(word.indexOf("j"));
        System.out.println(word.lastIndexOf("bread"));
        System.out.println(word.indexOf("bread")-1);
        System.out.println(word.indexOf("github")+6);
        System.out.println();
    }
}
