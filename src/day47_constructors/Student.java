package day47_constructors;

public class Student {
    //no args constructor
    public Student(){
        System.out.println("no-args constructor");
    }
    public Student (String name){
        System.out.println("name param constructor | name = " +name);
    }
    // constructor with age
    public Student(int age){
        System.out.println("age param constructor | age = " +age);
    }
    public Student(String name, int age){
        System.out.println("name and age param constructor name | age = " +age + "," + name);
    }
}
