package day36_methods_with_return;
import java.util.*;
public class Replit {
    static class Main {
        public static String profits(int buyPrice,int sellPrice){
            //your code here
            String result = "profit";
            if(sellPrice>buyPrice){
                return result;
            }else if(buyPrice>sellPrice){
                result="loss";
                return result;
            }else{
                result= "no loss";
                return result;
            }




        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(profits(in.nextInt(), in.nextInt()));
        }

    }
}
