package day53_inheritance.tesla;

public class Roadster extends ElectricCars{

    public Roadster(String model, String make, double price, int year, int range) {
        super(model, "Tesla", price, year, range);
        System.out.println("Welcome our new Roadster");
    }
}
