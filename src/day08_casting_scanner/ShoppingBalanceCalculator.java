package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double shoes = 89.99;
        double sucks = 15;
       double remainingBalance = balance - shoes - sucks;
       System.out.println("Remaining Balance =$"+ remainingBalance);
      int balanceWithNoCents= (int)remainingBalance;
      System.out.println(balanceWithNoCents);
      System.out.println("Your remaining balance without cents is $"+ balanceWithNoCents);
      byte num1 = 10;
      short num2= num1;
      Short num3 = 3689;
      int num4=num3;
      int num5=123456;
      long num6=num5;



    }
}
