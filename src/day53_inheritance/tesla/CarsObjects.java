package day53_inheritance.tesla;

public class CarsObjects {
    public static void main(String[] args) {
        ElectricCars ec1 = new ElectricCars("Tesla","Model Y",48190.00, 2021, 326);

        ec1.drive(50);
        System.out.println("ec1.toString() = " + ec1.toString());
        System.out.println("ec1.getMake() = " + ec1.getMake());
        System.out.println("ec1.getModel() = " + ec1.getModel());
        System.out.println("ec1.getPrice() = " + ec1.getPrice());
        System.out.println("ec1.getRange() = " + ec1.getRange());
        System.out.println("ec1.getYear() = " + ec1.getYear());

        if (ec1.getPrice() > 10000) {
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + "is out out of budget");

        }else{
            System.out.println("purchasing " + ec1.toString());
        }
        System.out.println(ElectricCars.getCount());

        ElectricCars ec2 = new ElectricCars("Tesla","CyberTruck", 59900,2022,300);

        System.out.println("ec2.toString() = " + ec2.toString());
        System.out.println("Count =" + ElectricCars.getCount());

        Roadster roadster = new Roadster("Tesla","Roadster", 200000,2022,620);
        System.out.println("roadster.toString() = " + roadster.toString());
        roadster.drive(2000);
        roadster.drive(1000);
        System.out.println("ElectricCars.getCount() = " + ElectricCars.getCount());

        ModelX modelX = new ModelX("Tesla", "ModelX",89990.0,2021,360);

        System.out.println("modelX.toString() = " + modelX.toString());
        modelX.drive(10);
        System.out.println("Having lunch");
        modelX.drive(10);
        System.out.println("remaining = " + modelX.getRange());
        System.out.println("ElectricCars.getCount() = " + ElectricCars.getCount());


    }
}
