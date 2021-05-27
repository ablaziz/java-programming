package day16_switch_ternary;

public class Day16Practice {
    public static void main(String[] args) {
        System.out.println("==============WELCOME TO SILMANDE HOTEL============");
        System.out.println("    01 BP 3467 OUAGADOUGOU 01; TEL:0022678827715");
        int numberOfBedroom = 5;
        int startingPrice = 1;
        switch (numberOfBedroom) {
            case 0:
                System.out.println("Studio bed room apartment");
                startingPrice = 2;
                break;
            case 1:
                System.out.println("1 bedroom selected");
                startingPrice = 3;
                break;
            case 2:
                System.out.println("master room selected");
                startingPrice = 10000;
                break;
            default:
                System.out.println("Go to our other location");
                return;

        }
    }
}
