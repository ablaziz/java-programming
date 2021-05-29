package day48_constructor_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs"); //dependency injection.
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("aziz");
        group1.addMember("Nour");
        group1.addMember("Andrey");
        group1.addMember("sarah");
        group1.addMember("Maria");
        group1.addMember("basel");
        group1.addMember("jason");

        group1.getMembers().size();
        System.out.println(group1.getMembers().size());

        System.out.println(group1);

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Aziz","peter","john","Andrey","bintou","mamou"));
        //print all members. not to string
        System.out.println(group2.getMembers());

        if(group2.getMembers().contains("Aziz")){
            System.out.println("Aziz is present");
        }else{
            System.out.println("Aziz in not there");
        }
        //remove members from group1

        group1.removeMember("aziz");
        group1.removeMember("Nour");
        System.out.println(group1.getMembers());
    }
}
