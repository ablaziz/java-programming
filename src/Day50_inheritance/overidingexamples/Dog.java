package Day50_inheritance.overidingexamples;

import Day50_inheritance.overidingexamples.Animal;

public class Dog extends Animal {
    public void run(){
        System.out.println("Dog can run");
    }
    @Override
    public void speak() {
        System.out.println("Dog is barking");
    }
}
