package day61_exceptions_collections.checked_exception;

public class CheckedexceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("about to sleep for 5 second");
        /**
         * Thread.sleep(5000) causes an InterruptedException which is checked exception
         * 1. Handling using Try catch
         * 2.Declaring using Throws keyword
         */

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            {
                e.printStackTrace(); //only prints when Exception happens
            }
            /**
             * 2) DECLARING USING THROWS KEYWORD
             */
            Thread.sleep(5000);

            System.out.println("Woke up after 10 seconds");
        }

    }

}
