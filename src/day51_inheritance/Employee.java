package day51_inheritance;

public class Employee {
    String jobTitle;

    public double calculateSalary(double hourlyRate) {
        return hourlyRate*40*52 + (hourlyRate*40*52)*0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
