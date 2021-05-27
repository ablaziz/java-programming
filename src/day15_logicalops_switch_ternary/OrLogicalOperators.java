package day15_logicalops_switch_ternary;

public class OrLogicalOperators {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apple  = 5;
        int oranges = 7;
        System.out.println(apple > 3 || oranges > 4);
        if(apple>3||oranges> 6){
            System.out.println("No need to buy apples or oranges today");
        }else{
            System.out.println("buy 10 apples and 5 oranges");
        }
        System.out.println(apple==0||oranges==0);
        if(apple==0||oranges==0){
            System.out.println("we need to buy apples or oranges today");
        }else{
            System.out.println("No need to buy apples or oranges today");
        }
    }
}
