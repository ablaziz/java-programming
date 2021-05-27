package java_home_work;
import java.util.Scanner;
public class MentorAssignment {
    public static void main(String[] args) {
       /* System.out.println("Hello\nAbdoul Aziz Niada");
        System.out.println(74+36);
        System.out.println(50/3);
        System.out.println((-5+8*6));
        System.out.println((55+9)%9);
        System.out.println(20+(-3*5/8));*/
Scanner scan=new Scanner(System.in);
//nt one = scan.nextInt();
//int  two = scan.nextInt();
//if(one--> two * 2){
   // System.out.println("one");

//}else{
    //System.out.println(two);
    byte b1 = scan.nextByte();
    byte b2 = scan.nextByte();
    int max = (b1>b2)?b1+2:b2-4;
    System.out.println(max);

    }
}
