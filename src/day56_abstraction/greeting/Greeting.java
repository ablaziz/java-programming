package day56_abstraction.greeting;

public interface Greeting {
    public abstract void hi(); // By default interface methods are abstract
    void bye(); // compiler is automatically adding public abstract in the background
}


