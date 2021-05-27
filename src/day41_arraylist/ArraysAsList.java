package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        // asList will convert Array to ArrayList
        List<Integer> nums = Arrays.asList(23,6,85,25,89);
        System.out.println("nums = " + nums);
       // nums.add(100) does not work because we have and immutable list. Size cannot be modified, only the value
        
        List<Integer> numsList = new ArrayList<>(Arrays.asList(3,8,97,68,15));
        numsList.add(64);
        numsList.add(1);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(15));

        /**
        List String drinksWithCaffeine--> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha, celsius
         int caffeineAmount = 0;
         String drink;
         monster, red bull, celsius:
         caffeineAmount = 150;
         coffee, kambucha:
         caffeineAmount = 112;
         tea, coke, pepsi, mdew:
         caffeineAmount = 35;

         */
        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke",
                                                                        "pepsi", "mdew", "kambucha", "celsius"));

        System.out.println(drinksWithCaffeine);
        int caffeineAmount = 0;
        for(String drink: drinksWithCaffeine){
            if(drink.equals("monster")||drink.equals("red bull")||drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink +" --> " + caffeineAmount);
            }else if(drink.equals("coffee")||drink.equals("kambucha")){
                caffeineAmount = 112;
                System.out.println(drink +" --> " + caffeineAmount);
            }else if(drink.equals("tea")||(drink.equals("coke")||(drink.equals("pepsi")||(drink.equals("mdew"))))){
                caffeineAmount =35;
                System.out.println(drink +" --> " + caffeineAmount);
            }
            }
        for(String drink : drinksWithCaffeine){
            switch(drink){
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink +" --> " + caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink +" --> " + caffeineAmount);
                    break;
                    case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink +" --> " + caffeineAmount);
                    break;
            }
          }
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(drink -> {
            System.out.println("-------");
            System.out.println("drink = " + drink);
            System.out.println("-------");
        });
        }


    }

