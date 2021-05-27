package day34_void_method;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }
    public static void seatInCar() {
        System.out.println("1. Open the door and seat");
    }
    public static void startTheCar() {
        System.out.println("2. Start the car");
    }
    public static void shiftToDrive(){
        System.out.println("3. Shift to drive.");
    }
    public static void pressGasPedal(){
        System.out.println("4. Press gas pedal.");
    }
}
