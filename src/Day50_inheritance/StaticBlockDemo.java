package Day50_inheritance;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class StaticBlockDemo {
    public static class inner{
        //Variable and method of inner class
    }
    static int num; // by default num=0
    static List<String> carModels;

    static {
        System.out.println("Static initializer block");
        //this method will only run one time
        num = 10;
        carModels= new ArrayList<>();
        carModels.addAll(Arrays.asList("Abarth",
                "Alfa Romeo",
                "Aston Martin",
                "Audi",
                "Bentley",
                "BMW",
                "Bugatti",
                "Cadillac",
                "Chevrolet",
                "Chrysler",
                "Citroën",
                "Dacia",
                "Daewoo",
                "Daihatsu",
                "Dodge",
                "Donkervoort",
                "DS",
                "Ferrari",
                "Fiat",
                "Fisker",
                "Ford",
                "Honda",
                "Hummer",
                "Hyundai",
                "Infiniti",
                "Iveco",
                "Jaguar",
                "Jeep",
                "Kia",
                "KTM",
                "Lada",
                "Lamborghini",
                "Lancia",
                "Land Rover",
                "Landwind",
                "Lexus",
                "Lotus",
                "Maserati",
                "Maybach",
                "Mazda",
                "McLaren",
                "Mercedes-Benz",
                "MG",
                "Mini",
                "Mitsubishi",
                "Morgan",
                "Nissan",
                "Opel",
                "Peugeot",
                "Porsche",
                "Renault",
                "Rolls-Royce",
                "Rover",
                "Saab",
                "Seat",
                "Skoda",
                "Smart",
                "SsangYong",
                "Subaru",
                "Suzuki",
                "Tesla",
                "Toyota",
                "Volkswagen",
                "Volvo"));
    }



    {//initializer block--> runs each time object is created, before constructor
        System.out.println("initializer block");
    }

    public StaticBlockDemo() {
        System.out.println("Constructor method");
        num+=5;
    }

    public  StaticBlockDemo(int value) {
        System.out.println("overloaded constructor = " + value);
        num+=value;
    }
}
