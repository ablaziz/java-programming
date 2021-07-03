package day59_polymorphism_exceptions;

public class InputField  implements WebElement{

    public static final String TAG_NAME = "input";

    public String getValue(){
        return "selenium";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input field" + txt);
    }

    @Override
    public void click() {
        System.out.println("Clicking on input field");
    }

    @Override
    public String getText() {
        System.out.println("getting text ");
        return "something";
    }
}
