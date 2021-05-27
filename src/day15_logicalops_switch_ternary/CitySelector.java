package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Alexandria";
        if (city.equals("Ouagadougou") || city.equals("Alexandria")) {
            System.out.println("Willing to relocate");
        } else {
            System.out.println("Double my Salary");
        }
        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Muridil")) {
            System.out.println("It is a java class with " + teacher);
        } else {
            System.out.println("It is a soft skill class with  " + teacher);
        }
        if (teacher.equals("Saim") || teacher.equals("Muradil")) {
            System.out.println();
        } else if (teacher.equals("Nadir")) {
            System.out.println();
        } else {
            System.out.println("Some other class with " + teacher);
        }
        String company = "Google";
        double salary = 100000;
        if (company.equals("Google") || salary >= 100000){
            System.out.println("accepting offer");
        } else{
            System.out.println("Rejecting offer");
        }





    }

    }

