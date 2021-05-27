package day26_for_loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num=10;
        if(num<1 || num> 10) {
            System.out.println("invalid input");
            return;
        }
        for (int i = 1; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + (num * i));

        }
        int factorial=5;
        for(int i = 1; i<=5; i++){
            System.out.println("Factorial " + 1*i + " = " + factorial*i);
        }
    }
}
