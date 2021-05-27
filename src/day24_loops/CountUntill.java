package day24_loops;
import java.util.Scanner;
public class CountUntill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until: ");
        int numberToStop = scan.nextInt();
        int startingNumber = 1;
        while(startingNumber<=numberToStop){
            System.out.print(startingNumber + " ");
            startingNumber++;
        }
    }
}
