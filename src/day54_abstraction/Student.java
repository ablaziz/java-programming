package day54_abstraction;

public abstract class Student {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }

    /**
     * we can add abstract method into abstract
     */


    public abstract void attendClass();

}
