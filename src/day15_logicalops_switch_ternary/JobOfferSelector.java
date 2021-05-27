package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location="DC";
        double salary = 120000.0;
        boolean hasBenefits = true;
        boolean isRemote = true;
        if(location.equals("DC") && salary>=120000 &&hasBenefits && isRemote){
            System.out.println("Accept offer");
        }else{
            System.out.println("Next interview please!");
        }
    }
}
