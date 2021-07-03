package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();
        spMan1.playWithKid();
        spMan1.feedKid();
        spMan1.raiseKid();
        //spMan1.work("SDET"); ERROR spMan1 is Father right now and can only access methods in father

        Worker spMan2 = new SuperMan();
        spMan2.work("as an SDET");
        System.out.println("spMan2.getPaid() = " + spMan2.getPaid());
        //spMan2.feedKid(); ERROR: spMan2 is a worker right now and doesn't have access to worker class

        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.work("Scrum master");
        spMan3.feedKid();
        spMan3.raiseKid();
        spMan3.playWithKid();
        // Superman is superman now and has access to all the methods

    }
}
