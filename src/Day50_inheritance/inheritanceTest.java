package Day50_inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Aziz";
        p1.age = 30;
        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.name = "murodil";
        t1.age = 25;
        t1.talk();
        t1.walk();
        t1.work("teacher");
        t1.teach("java");

        StudentIsAPerson student = new StudentIsAPerson();
        student.name="Ali";
        student.age=23;
        student.walk();
        student.work("java programmer");
        student.school="CybertekSchool";
        student.study("java programming inheritance");

    }
}
