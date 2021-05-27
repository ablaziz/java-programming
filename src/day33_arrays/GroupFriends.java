package day33_arrays;

public class GroupFriends {
    public static void main(String[] args) {
        String[] groupFriends = {"Adrian", "Mesut","Nour","Sarah", "Andrey"};
    for(String eachFriend: groupFriends){
        System.out.println("Happy Holidays " + eachFriend);
    }
    int[] nums ={12,65,58,987,789,159};
    for(int i =nums.length-1; i>=0; i--){
        System.out.print(nums[i] + " ");
    }
    }
}
