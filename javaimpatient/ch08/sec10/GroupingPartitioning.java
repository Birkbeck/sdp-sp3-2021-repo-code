package ch08.sec10;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingPartitioning {
    public static void main(String[] args) throws IOException {
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        Map<String, List<Locale>> countryToLocales = locales.collect(Collectors
                .groupingBy(Locale::getCountry));
        System.out.println("Swiss locales: " + countryToLocales.get("CH"));

        locales = Stream.of(Locale.getAvailableLocales());
        Map<Boolean, List<Locale>> englishAndOtherLocales = locales.collect(Collectors
                .partitioningBy(l -> l.getLanguage().equals("en")));
        System.out.println("English locales: " + englishAndOtherLocales.get(true));
    }
}