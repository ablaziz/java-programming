package day51_inheritance;

public class Contractor extends Employee{
    @Override // let everyone know that you are overriding
            //Ensure that this method is being overridden. if no, it shows error
    public double calculateSalary(double hourlyRate) {
        return 50*40*hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{}";
    }
}
