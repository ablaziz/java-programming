package day41_arraylist;

import java.util.ArrayList;

public class citiesList {
    public static void main(String[] args) {

        //declare

        ArrayList<String> cities = new ArrayList<>();

        //add cities

        cities.add("Washington DC"); // index 0
        cities.add("Vienna"); //index 1
        cities.add("Alexandria"); //index 2
        cities.add("Ouagadougou"); //index 3
        cities.add("Arlington"); // index 4
        //add LA to index 0.
        cities.add(0, "LA");

        //print all values in the same lime

        System.out.println(cities);
        // print first and last cities
        System.out.println("first city = " + cities.get(0));
        //print last city
        System.out.println("last city = " + cities.get(cities.size()-1));
        // Print count of item

        System.out.println("Count of item = " + cities.size());

        int size = cities.size();
        System.out.println("There are = " + size + "cities in the list");

        // for Loop and print all value in the same line

        for(int i=0; i< cities.size(); i++){
            System.out.print(cities.get(i)+", ");
        }
        System.out.println();

        // for each loop and print all values in the same line

        for(String each: cities){
            System.out.print(each+", ");
        }
        System.out.println();

    // delete item from arraylist
        //1- remove using index

        cities.remove(3);
        //or remove using object
        cities.remove("Vienna");

        System.out.println(cities);

        // remove everything

        cities.clear();

        System.out.println("ArrayList = " +cities);

        // Using is empty

        System.out.println(cities.isEmpty());

        // check size =0

        if(cities.size()==0){
            System.out.println("List is empty");
        }

    }
}
