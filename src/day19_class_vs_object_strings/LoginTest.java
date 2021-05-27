package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";
        String userName = "CYBERTEK";
        String password = "Abc123";
        if (expUserName.equalsIgnoreCase("userName") && expPassword.equals("Password")) {
            System.out.println("Pass - Logged in successfully");
        } else {
            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Failed: incorrect username");
            } else {
                System.out.println("Failed: incorrect password");
            }
        }
    }
}
