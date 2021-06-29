package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();

        /**
        Create a list of shapes and store 10 different shapes
         using a loop print out each shape
         */

        List<Shape> listOfShape = new ArrayList<>();
        listOfShape.add(new Triangle());
        listOfShape.add(new Circle());
        listOfShape.add(new Square());
        listOfShape.add(triangle);
        listOfShape.add(square);
        listOfShape.add(circle);
        listOfShape.add(new Square());
        listOfShape.add(triangle);
        listOfShape.add(square);
        listOfShape.add(circle);

        for(Shape eachShape: listOfShape){
            eachShape.draw();
        }
        drawShape(new Circle());
        drawShape(new Square());

    }
    public static void drawShape(Shape shape){
        System.out.println("-----Drawing Shape--------");
        shape.draw();

    }
}
