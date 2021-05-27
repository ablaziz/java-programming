package day29_nesteedForLoop;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print(outer*inner + "\t");
            }
            System.out.println();
        }
        String word= "java";
        for(int i =0; i<word.length();i++){
            for(int j=0;j<=i; j++){
                System.out.print(word.charAt(i) + " ");
            }
            System.out.println();
        }
    }
}