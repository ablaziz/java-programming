package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println(Calculator.add(23,69));
        System.out.println(Calculator.minus(32,6));
        System.out.println(Calculator.divided(98,36));
        System.out.println(Calculator.multiply(1,9));
        System.out.println(Calculator.remainder(98,20));
        
        double d1 = 32.6;
        double d2 = 369.3;
        double result = Calculator.minus(d1,d2);
        System.out.println("result = " + result);

    }


}
