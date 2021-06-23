package day56_abstraction.greeting;

public class Japanese implements Greeting{
    @Override
    public void hi() {
        System.out.println("hi in japoneese");
    }

    @Override
    public void bye() {
        System.out.println("Bye in Japneese");

    }
}
