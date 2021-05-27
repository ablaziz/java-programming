package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
    buildEmail("Saim","cyberteck");
    buildEmail("Abdoul Aziz Niada","Ciberteck");
    }
    public static void buildEmail(String name, String domain){
        String email = name.replace(" ","_").toLowerCase() + "@" +domain.replace(" ","").toLowerCase() + ".com";
        System.out.println(email);
    }
}
