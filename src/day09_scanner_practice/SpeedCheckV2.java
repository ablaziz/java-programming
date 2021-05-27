package day09_scanner_practice;
import java.util.Scanner;
public interface SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER CURRENT SPEED");
        int currentSpeed= scan.nextInt();
        int speedLimit=55;
        int mphOverTheSpeedLimit= currentSpeed-speedLimit;
        System.out.println("YOU ARE " + mphOverTheSpeedLimit+ " MPH" + " OVER THE SPEED LIMIT");
    }

}
