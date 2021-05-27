package day12_conditional_statements;

public class IfElseStatement {
    public static void main(String[] args) {
        if(10>3) {
            System.out.println(" CONDITION IS TRUE");
        }else {
            System.out.println("CONDITION IS FALSE");
        }
        int count = 25;
        if(count>30) {
            System.out.println("Condition is more than 30");
        }else{
            System.out.println("Condition is less than 30");
        }
        byte age = 25;
        if (age>=18) {
            System.out.println("ELIGIBLE TO VOTE");
            System.out.println("AGE IS GREATER OR EQUAL TO 18");
        } else{
            System.out.println("NOT ELIGIBLE TO VOTE");
            System.out.println("Age is less than 18");
        }
    }
}
