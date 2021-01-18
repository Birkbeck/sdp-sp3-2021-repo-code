package ch13.sec05;

import java.text.Collator;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

public class CollatorDemo {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("en");
        Collator coll = Collator.getInstance(locale);
        ArrayList<String> words = new ArrayList<>(
                List.of("Athens", "Ångström", "Zulu", "able", "zebra"));
        words.sort(coll);
        System.out.println(words);

        coll = Collator.getInstance(locale);
        coll.setStrength(Collator.PRIMARY);
        TreeSet<String> set = new TreeSet<>(coll);
        set.addAll(List.of("San José", "San Jose", "SAN JOSE", "San Jose\u0301"));
        System.out.println(set.size());
        
        coll = Collator.getInstance(locale);
        coll.setStrength(Collator.SECONDARY);
        set = new TreeSet<>(coll);
        set.addAll(List.of("San José", "San Jose", "SAN JOSE", "San Jose\u0301"));
        System.out.println(set.size());

        coll = Collator.getInstance(locale);
        coll.setStrength(Collator.TERTIARY);
        set = new TreeSet<>(coll);
        set.addAll(List.of("San José", "San Jose", "SAN JOSE", "San Jose\u0301"));
        System.out.println(set.size());
        
        coll = Collator.getInstance(locale);
        coll.setStrength(Collator.IDENTICAL);
        coll.setDecomposition(Collator.NO_DECOMPOSITION);
        set = new TreeSet<>(coll);
        set.addAll(List.of("San José", "San Jose", "SAN JOSE", "San Jose\u0301"));
        System.out.println(set.size());

        coll = Collator.getInstance(locale);
        set = new TreeSet<>(coll);
        set.addAll(List.of("JavaTM", "Java\u2122"));
        System.out.println(set.size());

        coll = Collator.getInstance(locale);
        coll.setDecomposition(Collator.FULL_DECOMPOSITION);
        set = new TreeSet<>(coll);
        set.addAll(List.of("JavaTM", "Java\u2122"));
        System.out.println(set.size());
        
        System.out.println(Arrays.toString(Normalizer.normalize("ée\u0301\u2122", Normalizer.Form.NFC).codePoints().mapToObj(n -> String.format("%04X", n)).toArray()));
        System.out.println(Arrays.toString(Normalizer.normalize("ée\u0301\u2122", Normalizer.Form.NFD).codePoints().mapToObj(n -> String.format("%04X", n)).toArray()));
        System.out.println(Arrays.toString(Normalizer.normalize("ée\u0301\u2122", Normalizer.Form.NFKC).codePoints().mapToObj(n -> String.format("%04X", n)).toArray()));
        System.out.println(Arrays.toString(Normalizer.normalize("ée\u0301\u2122", Normalizer.Form.NFKD).codePoints().mapToObj(n -> String.format("%04X", n)).toArray()));
    }    
}
