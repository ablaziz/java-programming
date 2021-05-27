package day38_methods;


public class StringUtilTest {
    public static void main(String[] args) {
        String userName= "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("Fail: User name cannot be null or empty");

            System.out.println("civic = " + StringUtils.isPalindrome("civic"));
            System.out.println("kayak = " + StringUtils.isPalindrome("kayak"));
            System.out.println("Cybertek = " + StringUtils.isPalindrome("cybertek"));
            String word = "Python";
            String revWord=StringUtils.reverse(word);
            System.out.println("word = " + word);
            System.out.println("revWord = " + revWord);
            System.out.println(StringUtils.reverse(word));
        }

    }


}

