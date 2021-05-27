package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance= 1230.54;
        System.out.println("balance = " + balance);
        double baklava=22.50;
        System.out.println("baklava = " + baklava);
        balance=balance-baklava;
        System.out.println("balance after baklava = " + balance);
        double kenafa=44.45;
        System.out.println("kenafa = " + kenafa);
        balance=balance-kenafa;
        System.out.println("balance after kenafa = " + balance);
        kenafa=kenafa/2;
        System.out.println("kenafa = " + kenafa);
        balance=balance-kenafa;
        System.out.println("balance after 2nd kenafa = " + balance);

        double plov=7.99;
        System.out.println("plov = " + plov);
        balance=balance-plov;
        System.out.println("balance after plov = " + balance);
        double icedTea=3.0;
        System.out.println("icedTea = " + icedTea);
        balance=balance-icedTea*8;
        System.out.println("balance after 8 Iced Tea = $" + balance);
        balance=balance+baklava;
        System.out.println("balance after return = " + balance);


    }
}
