package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC");
        int seconds = 0;
        while(seconds<=117){
            System.out.println("Watching \uD83D\uDC08- BBC at " + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching \uD83D\uDC08- BBC, lets start another one");

        int count =5;
        while (count<=5){
            count--;
        }

    }
}
