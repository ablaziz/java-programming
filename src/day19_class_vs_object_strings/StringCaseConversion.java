package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String school = "Cybertek";
        String sentence = "My team is playing right now";
        System.out.println(school.toLowerCase());
        System.out.println(school.toUpperCase());
        System.out.println("Cybertek".toUpperCase());
        System.out.println("My team is playing right now".toLowerCase());
        System.out.println(sentence.toUpperCase());
        
        String schoolInLcase = school.toLowerCase();
        System.out.println("schoolInLcase = " + schoolInLcase);
        school=school.toLowerCase();
        System.out.println("school = " + school);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("Amazon".toLowerCase());

        System.out.println("java".toUpperCase());
    }
}
