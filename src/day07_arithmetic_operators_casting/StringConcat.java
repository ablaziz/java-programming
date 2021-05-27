package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("java" + 5 + 3 +4); // because of the string it will print java534 (String+int=String)
        //if we add (), the () will be the priority of the arithmetic.
        System.out.println("java " + (5+3+4));
        System.out.println(5 + (3+ "java"));
        System.out.println("hello"+1+2+3);
        System.out.println("hello" +(1+2+3));
        String str1= "hello";
        String str2= "friends";
        System.out.println(str1+str2);
        System.out.println(str1+" "+str2);

        int num1= 7;
        int num2= 8;
        System.out.println(num1+num2);
        System.out.println(num1+" "+num2);// " "--> Space; ""--> empty
        System.out.println(num1+""+num2);
        char char1='a';
        char char2='b';
        System.out.println(char1+" "+char2);





    }
}
