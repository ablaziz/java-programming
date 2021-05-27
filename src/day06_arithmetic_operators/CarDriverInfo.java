package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel=("HONDA ACCORD LX");
        String driverName=("AZIZ");
        String licenseNumber=("12345678");
        short speed= 55;
        boolean automatic=true;
        char licenseClass= 'D';
        System.out.println("CAR MODEL                        :"+carModel);
        System.out.println("DRIVER NAME                      :"+driverName);
        System.out.println("The driver license number is     :"+licenseNumber);
        System.out.println("SPEED                            :"+speed+"MPH");
        System.out.println("CAR IS AUTOMATIC                 :"+automatic);
        System.out.println("License class                    :"+licenseClass);
        System.out.println(driverName +" is driving the car to work.");
       // System.out.println(automatic+" - "+licenseClass); Booleen+char doesn't work
        //if one of the addition is string then it will work
        System.out.println(automatic+" - "+licenseClass);
        System.out.println(10+5);
        String firstName= " Aziz";
        String lastName= " Niada";
        System.out.println("My full name is " + firstName +  lastName);


    }
}
