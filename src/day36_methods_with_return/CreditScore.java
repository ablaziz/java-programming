package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(800);
        checkEligible(500);
        int score = getCreditScore();
        //System.out.println(checkEligible(500)); error can't print void method
        System.out.println(getCreditScore());
        System.out.println("creditScore = " + getCreditScore());
        System.out.println("Score = " + score);
    }
    public static void checkEligible(int creditScore){
        if(creditScore>=700){
            System.out.println("you are eligible for for leasing this car");
        }else{
            System.out.println("You are not eligible for leasing this car.");
        }

    }
    public static int getCreditScore(){
        return 800;
    }
}
