package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        double fuelPrice =2.75;
        fuelPrice=fuelPrice-1;
        System.out.println(fuelPrice);
        int count=3;
        System.out.println("count = " + count);
        count = count + 2;
        System.out.println("count = " + count);
        int apples = 2;
        System.out.println("apples = " + apples);
        apples=apples+10;
        System.out.println("apples = " + apples);
        apples=apples-3;
        System.out.println("apples = " + apples);
        int pizzaSlices=8;
        pizzaSlices=pizzaSlices/2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices=pizzaSlices+6;
        System.out.println("pizzaSlices = " + pizzaSlices);
        int players= 10;
        System.out.println("players = " + players);
        players=2*players;
        System.out.println("players = " + players);
        int cents=244;
        System.out.println("cents = " + cents);
        cents=244%100;
        System.out.println("cents = " + cents);


    }
}
