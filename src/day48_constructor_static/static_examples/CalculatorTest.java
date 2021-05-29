package day48_constructor_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5,10);
       // Calculator.multiply(2,4); multiply is not static
        Calculator calcObject = new Calculator();
        calcObject.multiply(2,5);

        //Static method
        calcObject.add(10,45);
    }
}
