package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 2000.55;
        if(salesAmount <= 5000) {
            System.out.println("Good job! You are qualified for a bonus");
            bonus = 50.0;// conditional value assignment

        } else {
            System.out.println("Good job! You are qualified for a bonus");
            bonus = 100.0;
        }
        System.out.println("Your total bonus : $" + bonus);
    }
}
