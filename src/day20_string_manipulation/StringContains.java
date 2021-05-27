package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital One";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("api"));
        System.out.println(company.contains("l O"));
        System.out.println(company.contains("one"));

        if(company.contains(" ")){
            System.out.println("multiple words company");
        }else{
            System.out.println("Single word company name");
        }
        String etsyTitle = "wooden spoon | etsy";
        if(etsyTitle.contains(" | ")){
            System.out.println("pass - title check");
        }else{
            System.out.println("fail - title check");
        }

        String name = "Aziz";
        if(name.contains("A")&&name.contains("z")){
            System.out.println("Aziz");
        }else{
            System.out.println("not Aziz");
        }
        String email = "niada@yahoo.fr";
        if(email.contains("@")&&email.endsWith(".fr")){
            System.out.println("good email");
        }else{
            System.out.println("maybe bad email");
        }
        if(email.toLowerCase().contains(("n"))){
            System.out.println("case insensitive and n is present");
        }else{
            System.out.println("case insensitive and n not present");
        }
        String word = "java";
        System.out.println(word.replace("a","u"));
        String sentence = "java strings are fun";
    }
}
