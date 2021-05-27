package day29_nesteedForLoop;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word ="java";
        for (int i =0 ; i<word.length(); i++){
            for(int j =0; j<=i ; j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        String word1 ="java";
        for (int i =0 ; i<word.length(); i++){
            for(int j =i; j<word.length() ; j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

    }
}
