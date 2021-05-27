package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "wooden Spoonn";
        if(onSale && freeShipping) {
            System.out.println("Adding to cart " + itemName);
        }else{
            System.out.println("Continue shoppiing for good deal on - " + itemName);
        }
        if(onSale && freeShipping && itemName.equals ("wooden spoon")){
            System.out.println("adding to cart " + itemName);
        }else{
            System.out.println("Continue shoppiing for good deal on - " + itemName);
        }



    }
}
