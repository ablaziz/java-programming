package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";   //"drink";
        String drinkItem = "tea"; //coke
        String snack = "chips"; //candy
        if(selection.equals("drink")){
            System.out.println("drink option is selected");
        }if(drinkItem.equals("tea")){
            System.out.println("tea item is selected");
        }else{
            System.out.println("coke item is selected");
        }if(selection.equals("snacks")){
            System.out.println("snack item is selected");
        }if(snack.equals("chips")){
            System.out.println("chip action is selected");
        }else{
            System.out.println("candy item is selected");
        }
    }
    }
