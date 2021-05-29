package day48_constructor_static;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Aziz");
        bus.engine = new Engine(10);

        System.out.println(bus.toString());
        Bus metroBus = new Bus();
        metroBus.driver= new Driver("Aziz");
        metroBus.engine = new Engine(15);
    }
}
