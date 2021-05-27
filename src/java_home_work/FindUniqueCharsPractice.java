package java_home_work;

public class FindUniqueCharsPractice {
    public static void main(String[] args) {
        String name = "abdoulaziz";
        String unique = "";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
            if (!unique.contains(name.charAt(i) + "")) {
                unique += name.charAt(i);
            }

        }
        System.out.print(unique);
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}