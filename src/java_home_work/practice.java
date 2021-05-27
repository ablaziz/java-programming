package java_home_work;

import java.util.Scanner;

public class practice {
    /*
    Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
        -> If it is less print: "Password cannot be less than 5 characters"
        -> If it is more then or equal to 5 print: "Valid password"

    - Also the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
            -> Also change the password to have the value: "password"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name:");
        String userName = scan.next();
        System.out.println("Enter password");
        String password = scan.next();
        if(password.length()<5){
            System.out.println("Password cannot be less than 5 characters");
        }else if (password.length()>= 5 && !password.contains(userName)){
            System.out.println("Valid password");
            System.out.println(password.replace(password, "password"));
        } else{
            System.out.println("Invalid password, username should not be in password");
        }

/*
Given two String variables. One is a full name and the second a last name. Check if the full name has the same last name as the other String.
    Ex:
        s: "james bond"
        s: "bond"
        output: Same last name

        s: "alex benji"
        s: "bond"
        output: Not the same last name

 */
        String fullName = "ablaziz Niada";
        String lastName = "Niada";
        if(fullName.contains(lastName)){
            System.out.println("Same last name");
        }else{
            System.out.println("Not the same last name");
        }
        /*
        Given a String variable with a message. You will check if the message contains any of these bad words: “idiot, dumb, heck”
    -> If the message contains any of those words print: “Message not sent”.
    -> If the message is bad word free print “Message sent”
         */
        String message="I am studying at cybertek";
        if(message.contains("idiot") || message.contains("dumb") || message.contains("heck")){
            System.out.println("Your message " + message + "cannot be sent");
        } else{
            System.out.println("message sent");
        }
    }
}
