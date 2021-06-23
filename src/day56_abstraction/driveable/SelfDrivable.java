package day56_abstraction.driveable;

public interface SelfDrivable {
    void autoPiloting();
    //void selfPark(); error is subclasses because they must override abstract method
    public default void selfPark() { // if we add default method, it will prevent error
        System.out.println("performing self park steps");
    }
}
