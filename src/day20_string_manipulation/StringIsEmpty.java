package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        String job1Title = new String("");
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length()==0);// job title is empty
        if("".equals(jobTitle)){
            System.out.println("job title is empty");
        }else{
            System.out.println("job title is not empty");
        }
        if(jobTitle.length()==0){
            System.out.println("job title is empty");
        }else{
            System.out.println("job title is empty");
        }
        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        if(!veggie.isEmpty()){
            System.out.println("We have " + veggie);
        }
    }
}
