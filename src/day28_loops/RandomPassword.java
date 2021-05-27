package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String source ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random(); //help generate random numbers
        String password ="";
        for(int i=1; i<=8; i++) {
    int index = random.nextInt(71); //random number 0 to 70
            System.out.print(source.charAt(index));
            // source.substring(index, index +1) same as above
            //System.out.println(random.nextInt(source.length()));// or 71
            password += source.charAt(index);
        }
        System.out.println("\nyour password is " + password) ;
    }
}
