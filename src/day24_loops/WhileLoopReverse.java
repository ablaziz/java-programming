package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count>=0) {
            System.out.println("Count " + count);
            count--;
        }
        System.out.println(("Finish the count"));

        int unreadSMS = 10;
        System.out.println("I have total " + unreadSMS + " SMS to read");
        while(unreadSMS>0){
            System.out.println("SMS unread " + unreadSMS);
            unreadSMS--;
        }
        System.out.println("you are up to date");
    }
}