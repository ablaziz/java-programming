package OfficeHours.Practice_03_02_2021;

public class CountJava {
    public static void main(String[] args) {
        String str = "java is fun.java class today,java";
        int count=0; // how many time did we count java? count will store the number
        while (str.contains("java")){
            count++;
            str = str.replaceFirst("java","");//only replaces the first java
        }
        System.out.println("java was found " + count + " times");

    }
}
