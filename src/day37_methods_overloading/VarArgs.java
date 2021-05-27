package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(5,6);
        addNumbers(10,20,30,40,50,60,70,80,100);
        addNumbers();
    }
    public static void addNumbers(int... nums){
        int sum=0;
        for(int n : nums){
            sum+= n;
        }
        System.out.println("sum = " + sum);
    }
}
