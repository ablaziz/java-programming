package day18_conditions_practice_strings_intro;

public class SwitchCkeckNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        switch(num1) {
            case 10:
                num1++;
                num2 += 10;
                break;
            case 20:
                num1 += num2;
                num2--;
            case 30:
                num1 = 0;
                num2 -= 3;
                break;
        }
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        float f1 =(12453.1 > 12345.0)? 12456:12456.02f;
        float f2 = f1+ 1024;
        System.out.println(f2);
    }
}
