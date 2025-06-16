package gr.aueb.cf.ch19.regex;

public class RegExMain {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(isHello(s));
        System.out.println(isHelloOrHi(s));

        System.out.println(isHhello(s));
    }

    public static boolean isHello(String s){
        return s.matches("hello");
    }



    public static boolean isHelloOrHi(String s){
        return s.matches("hello|hi");
    }

    public static boolean isHhello(String s){
        return s.matches("[hH]ello");
    }

    public static boolean isStartWithUpperCase(String s){
        return s.matches("[A-Z]coding");
    }

    public static boolean isStartWithUpperCaseOrLowerCase(String s){
        return s.matches("[A-Za-z]coding");
    }
    public static boolean isStartWithLetter(String s){
        return s.matches("[A-Za-z0-9_]coding");
    }


}
