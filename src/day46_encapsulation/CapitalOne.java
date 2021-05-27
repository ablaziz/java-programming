package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setAccountNumber(433315466645l);
        account.setBalance(250.50);
        account.setAccountHolder("Niada");
        account.setType("Virtual Wallet performance select");
        System.out.println(account);
    }
}
