package OfficeHours.Practice_03_02_2021.officeHours;

public class practice {
    public static void main(String[] args) {
        int sumOfEven =0;
        for(int i=1;i<= 100; i++){
            if(i%2==0){
                sumOfEven+=i;
            }

        }
        System.out.println(sumOfEven);
        int sumOfOdd =0;
        for(int j=1; j<=100; j++){
            if(j%2!=0){
              sumOfOdd+=j;

            }
        }
        System.out.println(sumOfOdd);
    }
}

