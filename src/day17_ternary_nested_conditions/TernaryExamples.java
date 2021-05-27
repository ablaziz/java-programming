package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score =30;
        String result = (score >60) ? "pass": "fail";
        System.out.println("result = " + result);

        if(score>50){
            result = "pass";
            System.out.println("result = " + result);
        } else{
            result="fail";
            System.out.println("result = " + result);
        }
        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;

        if(quality.equals("good")){
            result = "100";
            System.out.println("result = " + result);
        }else{
            result= ("0");
            System.out.println("result = " + result);
        }
        int score3  =100;
        char grade = (score3>90)? 'A' : 'B';
        if(score3>90){
            grade = 'A';
        }else{
            grade='B';
            System.out.println("score3 = " + score3);
        }
    }
}
