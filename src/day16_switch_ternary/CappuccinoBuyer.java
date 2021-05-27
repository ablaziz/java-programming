package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        double price = 0;
        int calories=0;
        String size = "grande";
        switch(size){
            case "tall":
                System.out.println("Tall Cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande Cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("Venti Cappuccino please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We don't serve that size of Cappuccino");
                break; //optional after default

        }
        System.out.println(("Total price: $"+ price));
        System.out.println("you will consume");


        }
    }


