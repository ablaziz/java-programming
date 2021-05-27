package day19_class_vs_object_strings;

public class StringStartsEndWith {
    public static void main(String[] args) {
        String country = "Burkina";
        System.out.println(country.startsWith("Bur"));
        System.out.println(country.endsWith("kina"));
        System.out.println(country.startsWith("Burkina"));
        System.out.println("Burkina".endsWith("Burkina"));

        String name = "Mr. Aziz";
        if(name.startsWith("Mr.")){
            System.out.println("man");
        }else if(name.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if(name.startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if(name.startsWith("Ms.")){
            System.out.println("Single woman");
        }else if(name.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("NAME");
        }

        String url = "https://cybertekschool.okta.com";
        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }else if(url.endsWith(".fr")){
            System.out.println("france website");
        }else if(url.endsWith(".edu")){
            System.out.println("education website");
        }else if(url.endsWith(".gov")){
            System.out.println("Government website");
        }else if(url.endsWith(".org")){
            System.out.println("Organisation website");
        }

    }

}
