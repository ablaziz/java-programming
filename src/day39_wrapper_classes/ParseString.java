package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count =Integer.parseInt(total);
        System.out.println(count);
        
        String days = "39";
        int numberOfDays = Integer.parseInt(days);
        System.out.println("numberOfDays = " + numberOfDays);

        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);
        if(price>100){
            System.out.println("it is expensive");
        }



        String sentence ="I wrote 100 lines of code";
        String [] word = sentence.split(" ");
        int linesOfCode = Integer.parseInt(word[2]);
        System.out.println("linesOfCode = " + linesOfCode);



    }

}
