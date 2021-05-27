package day44_custom_classes;

public class MyApps { // this class is used to create object
    public static void main(String[] args) {
        App uberApp = new App();
       //open uber app - version 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open(); // call open method using object variable
        uberApp.version =4.0;
        uberApp.name = "What's up";
        uberApp.open();
    }
}
