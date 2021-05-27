package day12_conditional_statements;
import java.sql.SQLOutput;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Total Price");

        double totalPrice = scan.nextDouble();
        if(totalPrice >=25) {
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total is: "+ totalPrice);

        }else{
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is: "+ "$"+totalPrice);
        }
        System.out.println("THANK YOU FOR SHOPPING WITH AMAZON");
    }
}
