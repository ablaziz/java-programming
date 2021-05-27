package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println("MIN INT=" + Integer.MIN_VALUE);
        System.out.println("MAX VALUE= " + Integer.MAX_VALUE);

        System.out.println(Double.max(6.3,98.6));
        System.out.println(Double.compare(2,1));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('q'));
        System.out.println(Character.isLetter('l'));
        System.out.println(Character.isUpperCase('o'));

        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("is upperCase");
        }
        String word = "JaVa is FuN";
        for(int i =0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
        System.out.println();
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
    }
}
