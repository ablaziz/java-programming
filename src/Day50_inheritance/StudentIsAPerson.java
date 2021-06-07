package Day50_inheritance;

public class StudentIsAPerson extends Person {
    String school;

    public void study(String topic) {
        System.out.println(name+" Is studying " + school);
    }
}
