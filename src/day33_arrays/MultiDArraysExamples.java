package day33_arrays;
import java.util.*;
public class MultiDArraysExamples {
    public static void main(String[] args) {
        String[][] users =new String[3][2];
        users[0][0] ="Teodora tsveta";
        users[0][1] = "thhdh";
        users[1][0] ="Anna";
        users[1][1] = "Annapass";
        users[2][0]="Aziz";
        users[2][1]="azizpass";

        String[][] userData ={{"Teodora tsveta","thhdh"},{"Anna","Annapass"}, {"Aziz","Azizpaa"}};

        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData));
    }
}
