package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String reversed = "";
        String [] sentence1 = sentence.split(" ");
        for(int i = sentence1.length - 1; i>= 0; i--){
            reversed+=sentence1[i]+" ";
            System.out.print(sentence1[i]);
        }
        System.out.println("sentence = " + sentence );
        System.out.println("sentence = " + reversed.trim());
    }
}
