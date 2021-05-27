package OfficeHours.Practice_03_02_2021.officeHours;

public class Bank {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.accountHolderName = "Aziz Niada";
        myBankAccount.pinNumber = 1234;
        myBankAccount.balance =1_000_000;
        myBankAccount.accountNumber = 123456789;

        System.out.println(myBankAccount.pinNumber);
        System.out.println(myBankAccount.getBalance(1234));
    }
}
