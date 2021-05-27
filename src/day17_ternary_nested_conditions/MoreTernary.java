package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String response = (hourlyRate> 45)? "Accept" : "Reject";
       // String response = (hourlyRate> 45)?
        String todayClass = "Java";
        String teacher = (todayClass.equals("java"))? "Saim/Murodil" :"Nadir";

        boolean isEligibleToDrive =true;
        String driving = (isEligibleToDrive)? "have DL, can drive" : "cannot drive";
        System.out.println("isEligibleToDrive = " + driving);


    }
}
