package day30_arrays;

public class ForeachLoopArray {
    public static void main(String[] args) {
        int [] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        for(int eachNum : data){
            System.out.print(eachNum +" ");
            System.out.println();
        }
        for(int i =0; i< data.length; i++){
            System.out.print(data[i] +" ");
            System.out.println();
        }
        System.out.println("Last value of the array " + data[data.length-1]);
        for(int i = data.length-1; i>=0; i--){
            System.out.println(data[i] + " ");
        }
    }
}
