package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start() {// non abstract method
        System.out.println("Warming up and starting the exercise");
    }

    /**
     abstract method is a method without body or implementation, just a signature
     purpose: letting sub classes implement/override their own way
     */

    public abstract void perform();

    /**
     * another method that concrete sub classes will override/implement
     * @param minutes - how long is exercise performed
     * @return - returns number of munites
     */

    public abstract int getCaloriesCount(int minutes);
}
