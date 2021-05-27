package day25_loops;

public class PrintEvenOrOddNum {
    public static void main(String[] args) {
        System.out.println("Even Numbers between 0 and 100 : ");
        for(int n = 0; n<=100; n++){
            if(n%2==0){
                System.out.print(n + " ");

            }
        }
        System.out.println("\nOdd number");
        for(int num =0; num<=100; num++){
            if(num%2 !=0){
                System.out.print(num + " ");
            }
        }
    }
}
