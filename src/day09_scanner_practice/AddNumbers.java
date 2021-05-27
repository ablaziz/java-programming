package day09_scanner_practice;
import java.util.Scanner; // import a scanner class
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in); // Create scanner object than ask questions first very important.
        System.out.println("Enter 2 numbers");//
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1+num2;
        System.out.println("Result:" +result);
    }
}
