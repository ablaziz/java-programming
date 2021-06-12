package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {

        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("YouTube");
        mobileApp.setVersion(6.3);
        mobileApp.useTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion(1.2);
        instagram.useTheApp(20);
        instagram.download();

        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        b22Discord.setVersion(3.5);
        b22Discord.useTheApp(100);
        b22Discord.download();
        b22Discord.printInfo();
        System.out.println(b22Discord.getName());

    }



}
