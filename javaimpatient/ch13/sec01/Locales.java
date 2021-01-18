package ch13.sec01;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class Locales {
    public static void main(String[] args) {
        System.out.println(NumberFormat.getNumberInstance(
                Locale.ENGLISH).format(123456.78));
        System.out.println(NumberFormat.getNumberInstance(
                Locale.GERMAN).format(123456.78));
        
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate date = LocalDate.of(1961, 3, 22);
        System.out.println(formatter.withLocale(
                Locale.ENGLISH).format(date));
        System.out.println(formatter.withLocale(
                Locale.GERMAN).format(date));
        System.out.println(formatter.withLocale(
                Locale.CHINESE).format(date));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(formatter.withLocale(
                Locale.ENGLISH).format(date));
        System.out.println(formatter.withLocale(
                Locale.GERMAN).format(date));
        System.out.println(formatter.withLocale(
                Locale.CHINESE).format(date));
        
        Locale usEnglish = Locale.forLanguageTag("en-US");
        
        Locale defaultLocale = Locale.getDefault();
        Locale displayLocale = Locale.getDefault(Locale.Category.DISPLAY);
        Locale formatLocale = Locale.getDefault(Locale.Category.FORMAT);
        System.out.println("Default locales");
        System.out.println("General: " + defaultLocale);
        System.out.println("Display: " + displayLocale);
        System.out.println("Format: " + formatLocale);
        
        
        System.out.println("Available locales:");
        for (Locale loc : Locale.getAvailableLocales()) {
            String languageTag = loc.toLanguageTag();
            System.out.println(languageTag + ": " + loc.getDisplayName());
        }
        
        Locale loc = Locale.forLanguageTag("de-CH");
        System.out.println(loc.getDisplayName(Locale.GERMAN));
            
        Locale.setDefault(Locale.Category.FORMAT, Locale.GERMAN);
        System.out.println(LocalDate.now());
    }
}
