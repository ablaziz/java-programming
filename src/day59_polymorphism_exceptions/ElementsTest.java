package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.getHref();
        link.sendKeys("Hi");

        WebElement loginLink = new Link();
        loginLink.click();
        loginLink.getText();
        loginLink.sendKeys("hi");

        WebElement userName = new InputField();
        userName.sendKeys("wooden spoon");
        userName.click();
        userName.getText();

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(userName);
        //WebElementUtil.clickElement(new String("hello")); String is not child of WebElement

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();



    }
}
