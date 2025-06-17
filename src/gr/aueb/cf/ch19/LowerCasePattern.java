package gr.aueb.cf.ch19;

import java.util.regex.Pattern;

public class LowerCasePattern {
    public static void main(String[] args) {
        String s = "bU34&#PP";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])^.{8,}$");
    }
}
