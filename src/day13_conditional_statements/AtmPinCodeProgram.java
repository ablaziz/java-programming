package day13_conditional_statements;

public class AtmPinCodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM ****");
       int secretPincode= 1234;
        int inputCode = 1234;
        if(secretPincode>inputCode) {
            System.out.println("Welcome to your account");
            System.out.println("you can withdraw, check your balance, deposit");
        }else{
            System.out.println("Incorrect PINCODE! "+ inputCode);
            System.out.println("PLEASE TRY AGAIN!");
        }

    }
}
