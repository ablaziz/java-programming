package OfficeHours.Practice_03_02_2021;

public class GradeRetake {
    public static void main(String[] args) {
        int baseGrade = 90;
        int numberOfAttemps = 1;
        int retakePenalty = 0;
        if(numberOfAttemps == 1){
            retakePenalty = (int)(baseGrade * 0.10);
        }
        if(numberOfAttemps==2){
            retakePenalty = (int)(baseGrade * 0.10);
        }
        System.out.println("Grade after retake attemp " + numberOfAttemps + " was: " +(baseGrade -retakePenalty));
    }
}
