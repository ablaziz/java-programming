package day45_oops;

public class TrafficLight {
    String color;

    public void showColor() {
        System.out.println("current color = " + color);
    }
    public void changeColor(String newColor) {
        if(newColor.equalsIgnoreCase("red")||newColor.equalsIgnoreCase("yellow")
                ||newColor.equalsIgnoreCase("green")){
            System.out.println("changing color to " + newColor);
            color = newColor;
        }else{
            System.out.println("Error: Invalid color");
        }
    }
}
