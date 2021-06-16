package java_home_work.variables_practice;

public class MyWorkPlace {
   private String location;
  private String name;
  private String position;
   int loginID;
   double salary;

    public void employeeResponsibility(String name){
        System.out.println(name + "is working as" + position);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

