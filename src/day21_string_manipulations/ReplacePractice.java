package day21_string_manipulations;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        word = word.replace("hub", "lab");
        System.out.println("word = " + word);
        System.out.println(word.replace('i','o').replace('g','m').replace('b','u'));
        String sentence = "java is fun";
        System.out.println(sentence.replace(" ", ""));
        sentence = sentence.replace("java","selenium")
                           .replace("fun","a lot of fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ","")
                        .replace(",","")
                       .replace("results for java book","");
        System.out.println("result = " + result);


    }
}
