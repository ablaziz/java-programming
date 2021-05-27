package day38_methods;

public class MethodsCallAnother {
    public static void main(String[] args) {
    start();
    }
    public static void start(){
        System.out.println("start");
        continues();
    }
    public static void continues(){
        System.out.println("continues");
        end();
    }
    public static void end(){
        System.out.printf("end");

    }

    }


