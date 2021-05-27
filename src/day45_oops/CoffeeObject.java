package day45_oops;

public class CoffeeObject {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("coffee amount after refill " + myCoffee.getAmount());

        myCoffee.drink(10);
        System.out.println("coffee amount after drinking 10 = " + myCoffee.getAmount());
        myCoffee.setType("Turkish coffee");

        System.out.println("My coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());
        //assigning coffee1 object to coffee2
        Coffee coffee2 = coffee1;
        //nullPointerExcepetion


        System.out.println("Coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");

        System.out.println("Coffee1 type =" + coffee1.getType());
        System.out.println("Coffee2 type =" + coffee2.getType());

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");
        coffee3 = coffee2;
        System.out.println("Coffee3 type  = " + coffee3.getType());
    }
}
