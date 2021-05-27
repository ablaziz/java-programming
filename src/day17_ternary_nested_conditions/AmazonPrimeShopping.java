package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 30;
        boolean isPrimeMember = true;
        if (isPrimeMember) {
            System.out.println("Eligible for free 2 days shipping");
        } else {
            if (itemPrice >= 25) {
                System.out.println("eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. fee is $10");
            }
        }
        int check = 132;
        String str ="";
        if(check%2 ==0){
            str += "123";
        }else{
            str="500";
        }



    }
}
