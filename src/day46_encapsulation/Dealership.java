package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
       // car1.model = "Nissan Altima"; model, year, mileage are private and cannot be access from a different class.
        car1.setModel("Nissan Altima");
        car1.getModel();// to read the model name from the private class
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(2000);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1);// automatically calls to String

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Guilia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);


    }
}
