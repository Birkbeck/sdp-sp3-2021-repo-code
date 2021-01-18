package ch09.sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class TextIO {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("alice.txt");
        String content = Files.readString(path);
        System.out.println("Characters: " + content.length());
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        System.out.println("Lines: " + lines.size());
        try (Stream<String> lineStream = Files.lines(path, StandardCharsets.UTF_8)) {
            System.out.println("Average line length: " + lineStream.mapToInt(String::length).average().orElse(0));
        }
        try (Scanner in = new Scanner(path, "UTF-8")) {
            in.useDelimiter("\\PL+");
            int words = 0;
            while (in.hasNext()) {
                in.next();
                words++;
            }
            System.out.println("Words: " + words);
        }
        
        
        URL url = new URL("http://horstmann.com/index.html");
        try (BufferedReader reader
                = new BufferedReader(new InputStreamReader(url.openStream()))) {
            Stream<String> lineStream = reader.lines();
            System.out.println("Average line length: " + lineStream.mapToInt(String::length).average().orElse(0));
        }
        
        path = Paths.get("hello.txt");
        try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))) {
            out.println("Hello");
        }
        content = "World\n";
        Files.write(path, content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        path = Paths.get("copyOfAlice.txt");
        Files.write(path, lines, StandardCharsets.UTF_8);
        
        StringWriter writer = new StringWriter();
        Throwable throwable = new IllegalStateException();
        throwable.printStackTrace(new PrintWriter(writer));
        String stackTrace = writer.toString();
        System.out.println("Stack trace: " + stackTrace);
    }
}
