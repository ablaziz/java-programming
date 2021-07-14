package day62_collections;
import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        List<String> state = new Vector<>();
        state.add("VA");
        state.add("PA");
        state.add("IL");
        state.add("VA");

        System.out.println(state);
        //Vector is synchronized. Synchronized keyword in java means it is thread safe.When multiple thread try
        //to access the same resource at the same time, java will allow only one thread and lock it until the thread is done
        //Once thread completes the operation then next thread will be allowed to update/use the resource.
        //Resource could be arraylist object, array object, vector object or any other variable like string object , ect
    }
}
