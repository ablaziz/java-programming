package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("Mclean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("Cybertek school Address = " + cybertekAddress.toString());
        cybertekAddress.setStreet("927 N Van Dorn St apt 000");
        System.out.println("Cybertek school Address after update  = " + cybertekAddress.toString());
        System.out.println("Cybertek street info = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        System.out.println(newAddress.toString());

        Address papaJohn = new Address("123 n van", "VA","oo","000");


    }
}
