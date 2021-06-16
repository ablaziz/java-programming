package java_home_work.Employee;

public class CreatingEmployees {
    public static void main(String[] args) {

        EmployeePractice employee1= new EmployeePractice("Aziz","14&K",44000,30);
        EmployeePractice employee2=new EmployeePractice("Syeda","AdamsMorgan",47000,38);

        System.out.println("employee1.salary = " + employee1.salary);
        System.out.println("employee1.name = " + employee1.name);
        employee2.salaryRaise();
        System.out.println("employee2.salary = " + employee2.salary);
        employee2.salaryRaise();
        employee1.salaryRaise();
        System.out.println("employee1.salary = " + employee1.salary);
    }
}
