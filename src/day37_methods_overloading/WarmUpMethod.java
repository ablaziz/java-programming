package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
    loginVoid("CybertekStudent","abc123");//Positive test or sunny day
    loginVoid("Cybertek","a");//negative test
        System.out.println(login("CybertekStudent","abc123"));
        if(login("CybertekStudent","abc123")){
            System.out.println("Login Successful, welcome to CANVAS");
        }else{
            System.out.println("Login failed");
        }

        boolean isLoginSuccess=login("aziz", "niada");
        System.out.println("isLoginSuccess = " + isLoginSuccess);


    }
    public static void loginVoid(String userName, String password){
        String secretUsername = "CybertekStudent";
        String secretPassword = "abc123";
        if(userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)){
            System.out.println("Login successful, welcome CybertekStudent" );
        }else{
            System.out.println("Incorrect username or password");
        }

    }
    public static boolean login(String username, String password){
        String secretUsername = "CybertekStudent";
        String secretPassword = "abc123";
        if(username.equalsIgnoreCase(secretUsername)&&password.equals(secretPassword)){
            //or just return (username.equalsIgnoreCase(secretUsername)&&password.equals(secretPassword))
            //or
            return true;
        }
            return false;

    }
}
