package day61_exceptions_collections;

public class ElementaryStudentTests {
    public static void main(String[] args) {
        try {
            ElementaryStudents el1 = new ElementaryStudents();
            el1.setName("Bob");
            el1.setAge(4);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace();// print the error stacktrace and continue executing the rest of the code
        }

        System.out.println("---Execution complete---");
    }

}
