package ch09.sec04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        System.out.printf("%-30s%-30s%-20s\n", "Regex", "Input", "Matches");
        showMatches("a", "Java");
        showMatches(".", "Java");
        showMatches("\\x{1D546}", "The octonions \uD835\uDD46");
        showMatches("\\uD835\\uDD46", "The octonions \uD835\uDD46");
        showMatches("\\n", "Hello\nWorld");
        showMatches("\\cJ", "Hello\nWorld");
        showMatches("\\\\", "c:\\windows\\system");
        showMatches("\\Q.\\E", "Hello. World.");
        showMatches("[A-Za-z]", "San Jos\u00E9");
        showMatches("[^aeiou]", "Hello");
        showMatches("[\\p{L}&&[^A-Za-z]]", "San Jos\u00E9");
        showMatches("\\d", "99 bottles of beer");
        showMatches("\\w", "99 bottles of rosé");
        showMatches("\\s*,\\s*", "Hello, World");
        showMatches("(e|o).l", "Hello, World");
        showMatches("(['\"]).*\\1", "Hello, 'World'");
        showMatches("(?<quote>['\"]).*\\k<quote>", "Hello, 'World'");
        showMatches("(?:[a-z]:)?([\\\\/])\\w+(\\1\\w+)*", "c:\\windows\\system and /bin");
        showMatches("(?i:jpe?g)", "JPEG, jpeg, JPG, and jpg");
        showMatches("[0-9]{3,}", "99 bottles of 333");
        showMatches("<(.+?>).*</\\1", "<i>Hello</i>, <b>World</b>!");
        showMatches("'[^']*+'", "This 'joke' isn't funny.");
        showMatches("\\G\\w+,\\s*", "Athens, Rome, New York, Paris");
        showMatches("\\p{Punct}", "Hello, World!");
        showMatches("\\p{sc=Greek}", "2\u03C0r");
        showMatches("\\p{InLetterlike Symbols}", "Java\u2122");
        showMatches("\\pP", "Hello, World!"); // Ok to omit {} around one-letter properties
        showMatches("\\p{IsUppercase}", "Hello, World!");
        showMatches("\\p{javaJavaIdentifierStart}", "99 bottles");
    }
    
    public static void showMatches(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        System.out.printf("%-30s%-30s", regex, input);
        while (matcher.find()) {
            String match = matcher.group();
            System.out.print(match + " ");
        }
        System.out.println();        
    }
}
