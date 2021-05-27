package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars=10;
        System.out.println("cars = " + cars);
        cars=cars+2;
        System.out.println("cars = " + cars);
        cars += 5;
        System.out.println("cars = " + cars);
        cars+=5;
        System.out.println("cars = " + cars);
        cars -=8;
        System.out.println("cars = " + cars);
        int electricCars = 13;
        cars= cars + electricCars;
        System.out.println("cars = " + cars);
        cars += electricCars;
        String word = "java";
        System.out.println("word = " + word);
        word=word+ " programming";
        System.out.println("word = " + word);
        word=word + " is fun!";
        System.out.println("word = " + word);
        String selenium= " but selenium is more fun.";
        word+= selenium;
        System.out.println("word = " + word);
        word+=12345;
        System.out.println("word = " + word);

        char letter= 'A';
        System.out.println("letter = " + letter);
        letter += 20;
        System.out.println("letter = " + letter);
        letter += 'H';
        System.out.println("letter = " + letter);
        letter += 5;
        System.out.println("letter = " + letter);

        double parkingFee = 7.5;
        // early bird = 50% of
        parkingFee /=2;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee -=parkingFee;
        System.out.println("parkingFee = " + parkingFee);

        int count=2;
        count ++;
        System.out.println(count);
        count --;
        System.out.println("count = " + count);

        
    }
}
