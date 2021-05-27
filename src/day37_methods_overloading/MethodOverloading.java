package day37_methods_overloading;



public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(2,6));
        System.out.println();

    }
    public static int sum(int num1, int num2){
    return num1+num2;

    }
    public static int num(int num1, int num2, int num3){
        return num1+num2+num3;

    }
    public static double num(double num1 ,double num2 , double num3){
        return num1+num2+num3;
    }
    public static String num(String num1, String num2, String num3){
        return num1+num2+num3;
    }
}
