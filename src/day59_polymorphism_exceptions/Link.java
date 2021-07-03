package day59_polymorphism_exceptions;

public class Link implements WebElement {
    public static final String TAG_NAME = "a";

    public void getHref() {
        System.out.println("HREF =www.java.com");
    }

    @Override
    public void sendKeys(String str) {
        System.out.println("not supported");
    }

    @Override
    public void click() {
        System.out.println("Clicking the link");

    }

    @Override
    public String getText() {
        return "Oracle java";
    }
}
