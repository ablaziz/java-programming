package day61_exceptions_collections;

public class ElementaryStudents {
/**
 * add new class ElementaryStudent
 *
 * -> name, age
 * -> encapsulate the data.
 *
 * in the setter classes:
 *     setName(String name) :
 *         if name is empty
 *             throw illegalArgument Exception
 *                 with message: "Name cannot be empty"
 *         else
 *             this.name = name;
 *
 *     setAge(int age)
 *         if age is < 5 or more than 12
 *             throw new illegalArgumentException
 *                 with message: Age cannot be < 5 or > 12
 *         else
 *             this.age = age
 * You do not have permission to send messages in this channel.
 * ﻿
 */
private String name;
    private int age;

    public ElementaryStudents() {};

    public ElementaryStudents(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public String toString() {
        return "ElementaryStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        //check if name is null  first, otherwise we might get null pointer exception
        if(name==null || name.isEmpty()) {
           throw new IllegalArgumentException("name cannot be empty or null");
        }
        //we can add another condition like if name contains number or start with a number, throw another IllegalArgumentException
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<5 || age>12) {
          throw new IllegalArgumentException("age must be between 5 and 12");
        }
        this.age = age;
    }







}
