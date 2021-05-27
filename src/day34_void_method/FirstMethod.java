package day34_void_method;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();// 1st call to the method by putting the name
      //  displayMessage();// 2nd call
      //  displayMessage();// 3rd call
        for(int i =1; i<=100; i++){
            System.out.print(i +" - ");
            displayMessage();
        }
    }
    public static void displayMessage() {
        System.out.print("hello B22 Fiends!");
        System.out.print("My name is Aziz");
        System.out.println(". I am from Burkina Faso.");
    }
}
