package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
       String list ="cat,car,car,red_car,java,selenium,cat,car,car,cat";

       /* System.out.println(list.substring(i,i+3));
        i++;
        System.out.println(list.substring(i,i+3));
        i++;
        System.out.println(list.substring(i,i+3));
        i++;
        System.out.println(list.substring(3,6));
        System.out.println(list.substring(4,7));*/
        for(int i = 0; i<list.length()-2; i++){
            System.out.println(list.substring(i, i+3));
            String part = list.substring(i, i+3);
            if(part.equals("cat")||part.equals("car")){
                System.out.println("cat or car found");
            }
        }
    }
}
