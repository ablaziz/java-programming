package OfficeHours.Practice_03_02_2021;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        //double length = 5;
        //double width = 3;
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        double perimeter = 2*(length+width);
        double area = length+width;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
