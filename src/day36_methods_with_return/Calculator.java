package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(63.10, 250.2));
        System.out.println(minus(63.10, 250.2));
        System.out.println(multiply(63.10, 250.2));
        System.out.println(divided(63.10, 250.2));
        System.out.println(remainder(63.10, 250.2));
    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divided(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public static double remainder(double num1, double num2) {
        double result = num1 % num2;
        return result;
    }
}