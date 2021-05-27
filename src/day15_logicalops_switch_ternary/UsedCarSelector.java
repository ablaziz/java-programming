package day15_logicalops_switch_ternary;
import java.util.Scanner;
public class UsedCarSelector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = scan.nextDouble();
        String model = scan.next();
        double carPrice = scan.nextDouble();
        /*double budget = 5000.00;
        String model = "Honda";
        double carPrice = 6000.00;*/
        if(carPrice<=budget && (model.equals("Toyota")||model.equals("Honda") ||model.equals("Testla"))){
            System.out.println("Ready to purchase = " + model + ", price= " + carPrice);
        }else{
            System.out.println("Not interested in model = " + model + ", price = " + carPrice);
        }
    }
}
