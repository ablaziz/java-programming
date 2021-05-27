package java_home_work;

public class Loop {
    public static void main(String[] args) {
        /*
        Write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
    */
        int fizz=0; int buzz=0; int odd=0;
        for(int i =0; i<=100; i++){
            if(i%2 !=0){
               fizz +=i;
                
            }else if(i%5==0){
                buzz +=i;
            }
        }
        System.out.println("divisible by 3 " + fizz);
        System.out.println("divisible by 5 " + buzz);
    }
}