package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding =currentSpeed > speedLimit;
        System.out.println(currentSpeed>speedLimit);
        System.out.println(currentSpeed<speedLimit );
        System.out.println("Are you speeding? - " + isSpeeding);

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println(currentSpeed>speedLimit);
        System.out.println(currentSpeed<speedLimit);
        System.out.println("Are you speeding? - " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice=100;
        System.out.println("Can i afford? " +(accountBalance>=itemPrice));
        
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can Afford = " + canAfford);
        
        accountBalance -= itemPrice; // (accountBalance -itemprice)
        
        boolean isBroke = accountBalance <= itemPrice;
        System.out.println("isBroke = " + isBroke);

    }
}
