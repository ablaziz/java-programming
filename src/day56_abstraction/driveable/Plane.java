package day56_abstraction.driveable;

import day56_abstraction.driveable.SelfDrivable;
import day56_abstraction.driveable.Transportation;
import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting{
    @Override
    public void autoPiloting() {
        System.out.println("Flying on auto pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one place to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla cost " + (mile * 0.1) + " to drive " + mile + " miles");
    }

    @Override
    public void hi() {
        System.out.println("Plane is saying hi");
    }

    @Override
    public void bye() {
        System.out.println();
    }
}
