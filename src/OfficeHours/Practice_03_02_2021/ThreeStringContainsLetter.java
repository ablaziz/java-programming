package OfficeHours.Practice_03_02_2021;

public class ThreeStringContainsLetter {
    public static void main(String[] args) {


        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "computer";
        String biggestWordWithA = "";
        if (wordOne.contains("a") && wordOne.length() > biggestWordWithA.length()){
            biggestWordWithA = wordOne;

        }
        if (wordTwo.contains("a") && wordTwo.length() > biggestWordWithA.length()){
            biggestWordWithA=wordTwo;
        }
        if (wordThree.contains("a") && wordThree.length() > biggestWordWithA.length()){
            biggestWordWithA=wordThree;

        }
    }
}
