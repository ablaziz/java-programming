package day44_custom_classes;

public class Animal {
    String type= "some animal";
    public void eat() {
        System.out.println("Animal eats");
    }
    public void eat(String food) {
        System.out.println("eating" + food);
    }
    public void dance(String danceName) {
        System.out.println("dance" + danceName);
    }
    public void beautiful(String color){
        System.out.println("beautiful" + color);
    }
    public void speak() {
        System.out.println("Animal speaks");
    }
}
