package ch09.sec04;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemovingOrReplacingMatches {
    public static void main(String[] args) {
        Pattern commas = Pattern.compile("\\s*,\\s*");
        CharSequence input = "Peter , Paul,  Mary";
        String[] tokens = commas.split(input);
        System.out.println(Arrays.toString(tokens));
        
        Stream<String> tokenStream = commas.splitAsStream(input);
        System.out.println(tokenStream.collect(Collectors.toList()));
        
        Matcher matcher = commas.matcher(input);
        String result = matcher.replaceAll(",");
        System.out.println(result);
        
        Pattern time = Pattern.compile("(\\d{1,2}):(\\d{2})");
        matcher = time.matcher("3:45");
        result = matcher.replaceAll("$1 hours and $2 minutes");
        System.out.println(result);
        
        result = "3:45".replaceAll(
                "(?<hours>\\d{1,2}):(?<minutes>\\d{2})", 
                "${hours} hours and ${minutes} minutes");
        System.out.println(result);        
    }
}
