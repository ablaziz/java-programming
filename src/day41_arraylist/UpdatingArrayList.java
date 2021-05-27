package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("Honda");
        myCars.add("Toyota");
        myCars.add("Ford");
        myCars.add("Mazda");
        myCars.add("Opel");
        myCars.add("Tesla");
        myCars.add(0,"Jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");

        System.out.println(myCars.toString()); // prints all cars
        String allCarsInOneString = myCars.toString(); // Saves all cars to one variable

        System.out.println("allCarsInOneString = " + allCarsInOneString);

        // change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");
        System.out.println(myCars);
        //replace Honda with mazda
        myCars.set(3,"Mazda");
        System.out.println(myCars.toString());

        // for Replacing we can use index of and set
        //find index of toyota
        System.out.println(myCars.indexOf("Toyota"));
        int toyotaIndex = myCars.indexOf("Toyota");
        //replace Toyota by Kia
        myCars.set(toyotaIndex,"Kia");
        System.out.println(myCars);

        // replace Kia with Suziki

        myCars.set(myCars.indexOf("Kia"),"Susiki");
        System.out.println(myCars);

        // replace lada by Bugatti using if statement.

        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"), "Bugatti");
            System.out.println(myCars);
        } else{
            System.out.println("lada is not found");
        }

        /**
         lamborghini --> prius
         lada--> lexus
         Suziki --> bmw
         */
        for(int i = 0; i<myCars.size(); i++){
            if(myCars.get(i).equalsIgnoreCase("Lamborghini")){
                myCars.set(i, "prius");
            }else if(myCars.get(i).equalsIgnoreCase("lada")){
                myCars.set(i, "lexus");
            }else if(myCars.get(i).equalsIgnoreCase("Susiki")) {
                myCars.set(4, "bmw");
            }

        }
        System.out.println(myCars);

    }
}
