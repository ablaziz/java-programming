package Day50_inheritance.overidingexamples;

import Day50_inheritance.overidingexamples.Animal;

public class Cat extends Animal {

    public void jump() {
        System.out.println("CAt can jump");
    }
    @Override
    public void speak() {
        System.out.println("Cat is saying Meow");
    }
}
