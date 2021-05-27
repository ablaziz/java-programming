package day26_for_loop;
import java.util.*;
public class CountMatches {
    public static void main(String[] args) {
        /*String word="Competition";
        char letter ='i';
        int count =0;
        for(int i =0; i<word.length(); i++){
            if(word.charAt(i)==letter){
                count++;
            }
        }
        System.out.println("There are " + count + " " + letter + "'s " + word);*/

        long num = 16;

        for(int i =1;
            i>=0;
            i-- ){
            num = num*i;

            System.out.println(num);
        }
    }
}





