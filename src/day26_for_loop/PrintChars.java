package day26_for_loop;

public class PrintChars {
    public static void main(String[] args) {
        String word = "Aziz";
        for(int i=0; i<word.length(); i++){
            System.out.println(i +"-" + word.charAt(i));
        }
        for(int i =word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
