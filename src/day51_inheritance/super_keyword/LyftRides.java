package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new LyftXL();
        LyftXL lyftXLRide = new LyftXL();
        Lux luxRide = new Lux();

        System.out.println("LyftRide for 5 miles = $" + lyftRide.calculateRate(5));
        System.out.println("LyftXLRide for 5 miles = $" + lyftXLRide.calculateRate(5));
        System.out.println("Lux for 5 miles = $" + luxRide.calculateRate(5));

    }
}
