package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Alexandria";
        //equals() - case sensitive
        System.out.println(city.equals("Alexandria"));
        System.out.println(city.equals("alexandria"));
        // equalsIgnoreCase() - case insensitive comparison
        System.out.println(city.equalsIgnoreCase("Alexandria"));
        System.out.println(city.equalsIgnoreCase("ALEXANDRIA"));
        System.out.println(city.equalsIgnoreCase("Alexandria "));
        if(city.equals("Alexandria")){
            System.out.println("equals() true");
        } else{
            System.out.println("equals() false");
        }
        if(city.equalsIgnoreCase("AlexandRia")){
            System.out.println("equalsIgnoreCase() true");
        }else{
            System.out.println("equalsIgnoreCase() false");
        }
    }
}
