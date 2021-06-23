package day56_abstraction.greeting;

public class frenchLanguage implements Greeting {

    @Override
    public void hi() {
        System.out.println("Salut");

    }

    @Override
    public void bye() {
        System.out.println("Aurevoire");

    }
}
