package day09_scanner_practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AskAgeV1 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in) ;
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println(age + " -that's great age!");
        //scan.close; optional


    }
}
