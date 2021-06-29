package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();//not polymorphic: data type and object type are same
        a1.makeNoise();
        //Polymorphism - polymorphic way

        //parent type =  new child type.
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal cat = new Cat();

        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Cat());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Dog());

        for(Animal each: listOfAnimals){
            each.makeNoise();
        }


    }
}
