package day28_loops;

public class FindUniqueChars {
    public static void main(String[] args) {
        String word ="javva";
        String unique = "";
        for(int i = 0; i<word.length(); i++){
        System.out.print(word.charAt(i));
        //if word.charAt(i) is not in unique, add to unit
            if(!unique.contains(word.charAt(i)+"")){
                unique += word.charAt(i);
            }


        }
        System.out.println();
        System.out.println(unique);
    }
}
