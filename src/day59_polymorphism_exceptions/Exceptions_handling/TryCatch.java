package day59_polymorphism_exceptions.Exceptions_handling;

public class TryCatch {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 2);
            System.out.println(10 / 0);
            System.out.println(10 / 3);
        } catch (Exception e) {
            System.out.println("Runtime exception happened and handled");
        }
        System.out.println("After first try catch");

        int[] num = {11, 33, 44};

        try {

            System.out.println(num[0]);
            System.out.println(num[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught and handled");
        }
        System.out.println("After array code");
    }
}
