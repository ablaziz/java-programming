package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println("Full name = " + fullName());
        System.out.println("Is Married: " + isMarried());
        System.out.println(getAge() + " years old");
        System.out.println("Random year = " + getRandomYear());
        String name= fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
    }
    public static String fullName(){
       // System.out.println("Full name = " + fullName());
        return "Aziz Niada";
    }
    public static boolean isMarried(){
        return true;
    }
    public static int getAge(){
        return 35;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021); // random year untill 2021
        return randomYear;
    }
}
