package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println( 2584 > 1000 );
        System.out.println(255 < 6987);
        System.out.println(255 > 2222);
        System.out.println(25<=50);
        System.out.println(456<=456);
        System.out.println(100 != 21);

        int a = 100;
        int b = 200;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a!=b);

        boolean result;
        result = 5==5;
        System.out.println("result = " + result);
        result = 33>44;
        System.out.println("result = " + result);
        result = 88<99;
        System.out.println("result = " + result);
        result = 10>=10;
        System.out.println("result = " + result);
        result = 123<=124;
        System.out.println("result = " + result);
        result = 2 != 2;
        System.out.println("result = " + result);
        String city = "Seattle";
        System.out.println(city== "Siettle");

        String name = "Nadir";
        boolean checkName = name  == "Nadir";
        System.out.println("checkName = " + checkName);



    }
}
