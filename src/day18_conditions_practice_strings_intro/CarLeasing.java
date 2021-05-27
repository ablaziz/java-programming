package day18_conditions_practice_strings_intro;

public class CarLeasing {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leasePrice = 500;
        //  if(make.equals("Mercedes") && model.equals("E")){
        //         leasePrice =500;
        //    }else if(make.equals("Mercedes")&& model.equals("A")){
        //          leasePrice= 400;
        //      }
        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500;
            } else if (model.equals("A")) {
                leasePrice = 400;
            }
        } else {
            System.out.println("invalid make");
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);

        if (make.equals("Audi")) {
            if (model.equals("A3")) {
                leasePrice = 360;
            }
        } else if (model.equals("S")) {
            System.out.println("invalid make");
        }


    }
}
