package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat(" grass");
        animal.eat(" meat");
        animal.speak();
        System.out.println();
        animal.dance(" zouglou");
        animal.beautiful(" green");
        System.out.println("hello world");


        Animal cheetaObj = new Animal();
        cheetaObj.type ="cheeta";
        System.out.println(cheetaObj.type);
        cheetaObj.eat(" meat");


    }
}
