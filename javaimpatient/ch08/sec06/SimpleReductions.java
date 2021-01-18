package ch08.sec06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class SimpleReductions {
    public static void main(String[] args) throws IOException {
        String contents = Files.readString(Paths.get("alice.txt"));
        List<String> words = List.of(contents.split("\\PL+"));

        Optional<String> largest = words.stream().max(String::compareToIgnoreCase);
        System.out.println("largest: " + largest.orElse(""));

        boolean aWordStartsWithQ = words.stream().anyMatch(s -> s.startsWith("Q"));
        System.out.println("aWordStartsWithQ: " + aWordStartsWithQ);

        Optional<String> startsWithQ = words.stream().parallel().filter(s -> s.startsWith("Q")).findAny();
        System.out.println("startsWithQ: " + startsWithQ.orElse("(None)"));
            // Run the program again to see if it finds a different word
    }
}
