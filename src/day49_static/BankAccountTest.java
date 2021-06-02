package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        MyBankAccount husband = new MyBankAccount();
        husband.user = "husband";
        husband.showBalance(); //500
        husband.spend(100);
        husband.showBalance();

        MyBankAccount herAccount = new MyBankAccount();
        herAccount.user ="herAccount";
        herAccount.showBalance();
        herAccount.spend(301);
        herAccount.showBalance();
        husband.showBalance();
        System.out.println(MyBankAccount.balance);
    }
}
