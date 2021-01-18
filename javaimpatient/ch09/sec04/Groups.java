package ch09.sec04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\p{Alnum}+(\\s+\\p{Alnum}+)*)\\s+([A-Z]{3})([0-9.]*)");
        String input = "Blackwell Toaster    USD29.95";
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            String item = matcher.group(1);
            String currency = matcher.group(3);
            String price = matcher.group(4);
            System.out.printf("item=%s,currency=%s,price=%s\n", item, currency, price);
        }
        
        pattern = Pattern.compile("(\\p{Alnum}+(?:\\s+\\p{Alnum}+)*)\\s+([A-Z]{3})([0-9.]*)");
        matcher = pattern.matcher(input);
        if (matcher.matches()) {
            String item = matcher.group(1);
            String currency = matcher.group(2);
            String price = matcher.group(3);
            System.out.printf("item=%s,currency=%s,price=%s\n", item, currency, price);
        }
        
        pattern = Pattern.compile("(?<item>\\p{Alnum}+(\\s+\\p{Alnum}+)*)\\s+(?<currency>[A-Z]{3})(?<price>[0-9.]*)");
        matcher = pattern.matcher(input);
        if (matcher.matches()) {
            String item = matcher.group("item");
            String currency = matcher.group("currency");
            String price = matcher.group("price");
            System.out.printf("item=%s,currency=%s,price=%s\n", item, currency, price);
        }        
    }
}
