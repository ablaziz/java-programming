package day21_string_manipulations;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.toUpperCase().charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        String company = "Cybertek";
        System.out.println("first letter = " + company.charAt(0));
        char first = company.charAt(0);
        System.out.println(first);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fith = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);
        System.out.println(first+ " " + second + " " + third + " " + fourth + " " + fith + " " + sixth + " " + seventh + " " + eighth);

        String withSpaces = first+ " " + second + " " + third + " " + fourth + " " + fith + " " + sixth + " " + seventh + " " + eighth;
        System.out.println("withSpaces = " + withSpaces);


    }

}