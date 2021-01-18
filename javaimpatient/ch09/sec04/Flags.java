package ch09.sec04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Flags {
    public static void main(String[] args) {
        showMatches("[AO\u00C9]", Pattern.CASE_INSENSITIVE, "San José");
        showMatches("[AO\u00C9]", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CHARACTER_CLASS, "San José");
        showMatches("^[a-z ]+$", Pattern.MULTILINE, "99 bottles\nof beer\non the\rwall\n");
        showMatches("^[a-z ]+$", Pattern.MULTILINE | Pattern.UNIX_LINES, "99 bottles\nof beer\non the\rwall\n");
        showMatches(".", 0, "99 bottles\nof beer");
        showMatches(".", Pattern.DOTALL, "99 bottles\nof beer");
        showMatches(".# What a pattern!", Pattern.COMMENTS, "Hello");
        showMatches(".", Pattern.LITERAL, "Hello. World.");
        showMatches("\u00E9", 0, "San Jose\u0301");
        showMatches("\u00E9", Pattern.CANON_EQ, "San Jose\u0301");
    }
    
    public static void showMatches(String regex, int flags, String input) {
        Pattern pattern = Pattern.compile(regex, flags);
        Matcher matcher = pattern.matcher(input);
        System.out.printf("%-30s%-30s", regex, input);
        while (matcher.find()) {
            String match = matcher.group();
            System.out.print(match + " ");
        }
        System.out.println();        
    }
}
