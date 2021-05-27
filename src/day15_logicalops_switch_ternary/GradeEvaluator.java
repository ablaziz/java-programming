package day15_logicalops_switch_ternary;
import java.util.Scanner;
public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char grade = scan.next().charAt(0);
        //char grade = 'k';
        if ((grade=='A'||grade=='a')|| (grade =='B' ||grade=='b')|| (grade =='C'||grade=='c')){
            System.out.println("Pass with grade: " + grade);
        }else if(grade=='D'){
            System.out.println("Qualified for retake: " + grade);
        }else if(grade=='E'){
            System.out.println("Fail: " + grade);
        }else{
            System.out.println("Invalid grade: " + grade);
        }

    }
}
