package day45_oops;

public class TrafficLightObject {
    public static void main(String[] args) {
        // create traffic light object
        TrafficLight trafficLight = new TrafficLight();
       // trafficLight.color="red"; not best practice
        //Preferred way = we will assign//update the value of color using a method of the class
        trafficLight.changeColor("green");
        //call method to access the variable
        trafficLight.showColor();

        trafficLight.changeColor("red");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("red");
        trafficLight2.showColor();

    }
}
