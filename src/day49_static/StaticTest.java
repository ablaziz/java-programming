package day49_static;

public class StaticTest {
    static String word ="java";
    public static void main(String[] args) {
        //1 Static method can bee called using class name.
        StaticMethods.displayMessage("wooden spoon");
        //1 instance method needs an object to be called
       // StaticMethods.instanceMethod(); Error
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //2 Static method can only access other static variables and method
        System.out.println(word);
    }
}
