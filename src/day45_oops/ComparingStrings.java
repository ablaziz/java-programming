package day45_oops;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; // is located in String pool
        String word2 = "java"; // re-use from String pool
        String word3 = new String("java");// create new object in HEAP, outside String Spool
        String word4 = new String("java");// create new object in the HEAP
        System.out.println(word1==word2); //true point the same object in pool
        System.out.println(word1==word3); //False point different object in HEAP and POOL
        System.out.println(word3==word4); //False point to different object in the HEAP

        System.out.println(word1.equals(word1)); //TRUE - comparing values
        System.out.println(word1.equals(word3)); //TRUE - comparing values
        System.out.println(word3.equals(word4)); //TRUE - comparing values


    }
}
