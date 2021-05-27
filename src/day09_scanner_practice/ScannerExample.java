package day09_scanner_practice;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        System.out.println("Print name, age and salary");
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        System.out.println("name =" +name + "age = " + age + "salary = " + salary);

    }
}
