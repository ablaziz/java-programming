package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html,selenium, testing, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        int indexOfJava = technologies.indexOf("java");
        System.out.println(indexOfJava);
        int idxOfSelenium = technologies.indexOf("selenium");
        System.out.println(idxOfSelenium);
        int indexOfCucumber = technologies.indexOf("cucumber");
        int indexOfSql = technologies.indexOf("sql");
        System.out.println(indexOfSql);

        if (technologies.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven not present");
        }
        if (technologies.indexOf("maven")>-1){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not there");
        }
    }
}
