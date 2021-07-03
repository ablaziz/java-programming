package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;

public class InstanceOf {
    public static void main(String[] args) {
        //Instance of operator
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Shape);

        if(shape instanceof Circle){
            System.out.println("It is a circle");
        }else if (shape instanceof Shape){
            System.out.println("it is a square");
        }else{
            System.out.println("what kind of shape is that?");
        }

        /**
         * Java reflection API
         */
        System.out.println(shape.getClass().getSimpleName());
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("Object class name of el variable " + el.getClass().getSimpleName());

    }

}
