package java_home_work;
import java.util.*;
public class loopPractice {
    public static void main(String[] args) {
        /*Write a program that can calculate the sum of all the even numbers
between 1 ~ 100*/
    Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        for(int i=start; i<=end; i++){

            System.out.println(i+"");
        }


    }
}
