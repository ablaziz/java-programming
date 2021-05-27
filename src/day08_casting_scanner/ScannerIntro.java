package day08_casting_scanner;
//import scanner class into the class (1)
import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // create scanner object. (2)
        System.out.println("Please enter your name");
        String firstName= scan.next();// the point where the code is waiting for us to type something
        System.out.println("nice to meet you, " +firstName);

    }
}
