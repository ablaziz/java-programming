package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.replace("a","u"));
        String sentence = "java strings are fun";
        System.out.println(sentence.replace("strings","conditions"));
        System.out.println(sentence.replace("a","u"));
        System.out.println(sentence.replace("strings",""));
    }
}
