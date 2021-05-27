package day09_scanner_practice;
import java.util.Scanner;

public class TempConvertor {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("###### F To C Converter program ######");
        System.out.println("      Enter Fahrenheit value");
        double fahrenheitValue= scan.nextDouble();
        double celsiusValue = (fahrenheitValue-32)*5/9;
        System.out.println(fahrenheitValue + "F to C" + celsiusValue);



    }

}
