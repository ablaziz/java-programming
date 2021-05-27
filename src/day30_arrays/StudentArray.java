package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 ={"00021","Aziz","Niada","B22","570000000"};
        String[] student2 = new String[5];
        student2[0] ="1236";
        student2[1] ="abdoul";
        student2[2] = "nada";
        student2[3] ="b22";
        student2[4] ="123456789";
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 first name = " + student1[1]);
        System.out.println("student1 last name = " + student1[2]);
        System.out.println("student1 batch  = " + student1[3]);
        System.out.println("student1 phone number = " + student1[4]);
        System.out.println("Student1 data length = " + student1.length);
        if(student1.length==5){
            System.out.println("pass: data array contains 5 item");
        }else {
            System.out.println("Fail: data array has incorrect length" );
        }
        if(student2.length==student1.length){
            System.out.println("pass: data arrays length match");
        }else{
            System.out.println("Fail: data array length mismatch");
        }
        System.out.println(student1[1].toUpperCase() + " " +student1[2].toUpperCase());

    }
}
