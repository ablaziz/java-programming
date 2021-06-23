package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        frenchLanguage french = new frenchLanguage();
        french.hi();
        french.bye();
        Greeting greeting = new frenchLanguage();
        greeting.hi();
        greeting.bye();

        Japanese japanese = new Japanese();
        japanese.hi();
        japanese.bye();

        greeting = new Japanese();
        greeting.hi();
        greeting.bye();


    }
}
