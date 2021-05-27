package day34_void_method;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("---Starting Etsy search Smoke Test");
        openBrowser();
        navigateToEstyUrl();
        searchForWoodenSpoon();
    }
    public static void openBrowser(){
        System.out.println("launching chrome browser");
    }
    public static void navigateToEstyUrl(){
        System.out.println("Navigate to https://www.etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("pass: Verify Etsy home page is displayed");
        System.out.println("Type 'wooden spoon' in search field and click search");
    }
    public static void v(){
        System.out.println("Pass: Search results are successfully displayed");
    }
}
