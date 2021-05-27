package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;
        if (isHungry) {
            System.out.println("I am hungry i will go get something to eat");
        } else {
            System.out.println("I am not hungry, let's keep coding");
        }
        double price= 130.44;
        boolean isAffordable=200>=price;
        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable) {
            System.out.println("I can afford it!");

        }else {
            System.out.println("It is too expensive");
        }
        boolean isRemoteJob = true;
        //(!isRemoteJob)==> is not remote job
        if(isRemoteJob!=true)
       // if(!isRemoteJob)
        {
            System.out.println("Sorry i am noy interested");

        }else{
            System.out.println("Sure i am interested, what is the interview process");
        }
        int x=10;
        // int y= x++;
        //System.out.println(y++ +"" +x++ + "" + y);
        boolean a = true, b = !false;
        if(b){
            System.out.println("B");
        }else if(a){
            System.out.println("a");
        }else{
            System.out.println("c");
        }



    }


}
