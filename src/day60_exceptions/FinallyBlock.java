package day60_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            System.out.println("you entered " + num);
            System.out.println(num/0);
           // System.exit(0); // Stop java all Together. Finally block will not run
        }catch (InputMismatchException e) {
            System.out.println("Invalid value!");
        }finally {
            scanner.close(); // Close and clean up the scanner
            System.out.println("Finally block");
        }

    }
}
