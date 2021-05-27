package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
       //pre increment
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // post increment

       int num3= 8;
       int num4= num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        int a = 50;
        int b = 22;
        int c = a++ + ++b; // (in the addition, a=50; b=23)
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);




    }
}
