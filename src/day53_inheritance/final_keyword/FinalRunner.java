package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME = "change"; ERROR< CANNOT CHANGE THE VALUE OF FINAL VARIABLES

        final int SSN = 123456475;
       // SSN = 45666633333; ERROR! SSN IS FINAL
    }
}
