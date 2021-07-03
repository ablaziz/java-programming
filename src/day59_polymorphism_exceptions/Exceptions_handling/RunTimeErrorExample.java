package day59_polymorphism_exceptions.Exceptions_handling;

public class RunTimeErrorExample {
    public static void main(String[] args) {
        /**
         *  RUNTIME-EXCEPTION
         */
        System.out.println(10/2);
        System.out.println(10/0); //runtime exception. (ArithmeticException, can not / by zero
        System.out.println(10/3);
    }
}
