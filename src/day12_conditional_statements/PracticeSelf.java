package day12_conditional_statements;
import java.util.Scanner;
public class PracticeSelf {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        if(name == "Chen"){
            System.out.println("Is the teacher");
        }else{
            System.out.println("Is a student");
        }
    }
}
