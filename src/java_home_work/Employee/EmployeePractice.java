package java_home_work.Employee;

public class EmployeePractice {
    String name;
    double salary;
    String location;
    int age;
    int workExperienceYear;

    public EmployeePractice(String name, String location, double salary, int age) {
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.age = age;

    }

    public void salaryRaise() {
        if(age>35){
            this.salary = salary*1.2;
        }else {
            this.salary = salary;
        }


    }
}
