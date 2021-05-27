package day24_loops;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode;
        do{
            System.out.println("enter your Pin code");
             pinCode = scan.nextInt();
        }while(pinCode != secretPinCode);

        System.out.println("WELCOME TO YOUR ACCOUNT");


    }
}
