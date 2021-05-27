package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word ="github";
        char letter ='a';
        int index = -1; // we are suposing that our letter cannot be find (is not there)
        for(int n = 0; n<word.length(); n++){
           // System.out.println(n + " - " + word.charAt(n));
            if(word.charAt(n) ==(letter)){
                index = n;
                System.out.println(letter +" is found at index " +index);
                break; //exit the for loop insted of using return to exit the main method
            }

            }
        if(index==-1){
            System.out.println(letter + " letter is not present");
        }else{
            System.out.println();
        }
        }
    }

