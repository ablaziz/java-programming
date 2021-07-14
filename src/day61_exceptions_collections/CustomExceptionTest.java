package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 70;
        System.out.println("Class is going on for " + minutes+ " minutes");
        if(minutes>50) {
            throw new BreakTimeException("It is break time");
        }
        System.out.println("Lets continue the class");
        double balance = 400;
        double itemPrice = 500;

        if(itemPrice>balance){
            throw new InsufficientBalanceException("You don't have enough money bro! try the cheaper one");
        }

        System.out.println("item successfully purchased");

    }
}
