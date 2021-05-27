package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        if(!(age>7)){
            System.out.println("Not allowed in the non driver sit");
        }else{
            System.out.println("is allowed to sit in the front seat");
        }
boolean isSmokingAllowed = false;
        if(!isSmokingAllowed){
            System.out.println("you can't smoke here!");
        }else{
            System.out.println("you can smoke here!");
        }
        boolean isAffordable = true;
        if(!isAffordable){
            System.out.println("Pick a different product");
        }else{
            System.out.println("enjoy");
        }
        String carModel = "Tesla";
        if(!carModel.equals("Tesla")){
            System.out.println("Not interested!");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!inputPassword.equals(secretPassword) ){
            System.out.println("incorrect password");
        }
    }
}
