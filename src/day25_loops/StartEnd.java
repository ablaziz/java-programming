package day25_loops;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
    int start = scan.nextInt();
    int end = scan.nextInt();
    if(start>end){
        System.out.println("reverse numbers");
    }
        for(int i = start; i<=end; i++){
            System.out.print(i + " ");
        }


    }
}
