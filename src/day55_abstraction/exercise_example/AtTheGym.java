package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
       // Exercise exercise = new Exercise(); ERROR cannot create object or instantiate abstract classes
        Exercise exercise = new Running();//polymorphism
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 minutes - calories " + exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 minutes - calories " + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Running 30 minutes - calories " + swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Running 30 minutes - calories " + freeWeight.getCaloriesCount(30));
    }
}
