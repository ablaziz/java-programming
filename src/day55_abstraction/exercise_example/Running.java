package day55_abstraction.exercise_example;

public class Running extends Exercise{
    @Override
    public void perform() {
        System.out.println("Performing running exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*13;// average number of calories per minute =13
    }
}
