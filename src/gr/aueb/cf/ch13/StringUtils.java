package gr.aueb.cf.ch13;

public class StringUtils {

    private StringUtils(){

    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        return String.valueOf((sb.reverse()));
    }

    public static Boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString().equalsIgnoreCase(s);
    }
}
