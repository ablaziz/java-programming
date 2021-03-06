package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";
        word = null;
        try {
            System.out.println("word = " + word);
            System.out.println("word.length() = " + word.length());
            System.out.println("word.substring(2) = " + word.substring(20));
        }catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled, please check if String has valid value");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is wrong, please check if you entered a valid index");
        }catch (Throwable t) {
            System.out.println("Exception is caught");
            System.out.println("Reason = " + t.getCause());
        }

        System.out.println("---More code after try catch---");
    }
}
