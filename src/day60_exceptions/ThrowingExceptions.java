package day60_exceptions;

public class ThrowingExceptions {
    public static void main(String[] args) {
        System.out.println("Lets create exceptions");
       // RuntimeException e = new RuntimeException();
       // throw e;

       // throw new RuntimeException();
        String userName = "";
        if (userName.isEmpty()) {
            throw new RuntimeException("username cannot be empty");
        }

    }
}
