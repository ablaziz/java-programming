package day61_exceptions_collections;

public class BreakTimeException extends RuntimeException{ //creating our custom exception

    public BreakTimeException() {
    }

    public BreakTimeException(String message) {
        super(message);// call to parent constructor
    }
}
