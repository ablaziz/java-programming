package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN = 1234;
        int expPinCode = 1234;
        int last4SSN = 0;
        int pinCode = 1234;
        if (pinCode == expPinCode && last4SSN == expLast4SSN) {
            System.out.println("Coorrect PIN number, welcome to your account");
        } else {
            System.out.println("incorrect information");
            if (last4SSN != expLast4SSN) {
                System.out.println("last 4 is not correct");
            }
            if(expPinCode!=pinCode){
                System.out.println("pin code is incorrect");
            }
        }

    }
}

