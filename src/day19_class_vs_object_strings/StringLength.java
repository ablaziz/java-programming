package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String name = "Niada";
        System.out.println(name.length());
        System.out.println("count: " + name.length());
        System.out.println("wooden spoon".length());
        String firstName = "Abdoul Aziz";
        System.out.println(firstName+ " : " + firstName.length());
        System.out.println("Abdoul Aziz".length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc13";
        if(password.length()>=6){
            System.out.println("Valid Amazon password");
        }else{
            System.out.println("Password must be at least 6 characters");
        }
    }
}
