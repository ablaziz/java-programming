package day59_polymorphism_exceptions.Exceptions_handling;

public class SwallowingException {
    public static void main(String[] args) {
        try {
            System.out.println("hello");
            System.out.println(5/0);
        }catch (Exception ignore){}

        System.out.println("how are you today?");
        System.out.println("We just suppressed/swallowed the runtime exception");
        System.out.println("Error is not reported, we just ignored it. Nobody knows about it");
    }
}
