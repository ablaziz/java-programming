package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "sender: [Nadir] from Number<2023751774> Message : {Hello, lets code some java}";
        String sender, mobile, text;
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1,end));
        sender = message.substring(start+1,end);
        System.out.println("sender = " + sender);

        mobile = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        text = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("mobile = " + mobile);
        System.out.println("text = " + text);

        String myName = "   Abdoul      aziz    Niada      ";
        System.out.println(myName.trim()); // .trim() only removes spaces on the begining end end of the word
    }
}
