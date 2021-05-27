package OfficeHours.Practice_03_02_2021.officeHours;

public class BankAccount {


    String accountHolderName;// instance variable
    int pinNumber;
    double balance;// instance variable
    long accountNumber;// instance variable

    public double getBalance(int pinCode) {
        if (pinNumber == pinCode) {
            return balance;
        }
        return -1;
    }


}
