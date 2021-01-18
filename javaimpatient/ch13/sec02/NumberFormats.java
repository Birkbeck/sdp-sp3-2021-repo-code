package ch13.sec02;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormats {
    public static void main(String[] args) {
        Locale loc = Locale.GERMANY;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(loc);
        double amt = 123456.78;
        String result = formatter.format(amt);
        System.out.println(result);
        
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number such as 12,345: ");
            String input = in.next();    
            formatter = NumberFormat.getNumberInstance();
               // Get the number formatter for default format locale
            Number parsed = formatter.parse(input);
            double x = parsed.doubleValue();
            System.out.println("Parsed number: " + x);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
