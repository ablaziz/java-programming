package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        int speedLimit= 55;
        int currentSpeed= 75;
        int overTheLimit= currentSpeed-speedLimit;
        System.out.println("YOU ARE " + overTheLimit+ " MPH" + " OVER THE SPEED LIMIT");
    }
}
