package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.List.of;

public class FilesExample {
  public static void main(String[] args) {
    // print a file, one line at a time
//    try (var lines = Files.lines(Paths.get("resources/alice30.txt"))) {
//      lines.limit(10).forEach(System.out::println);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    // prints sorted list of unique non-empty, lines in a file (trimmed)
//    try (var lines = Files.lines(Paths.get("resources/alice30.txt"))) {
//      lines.limit(10).map(String::trim).filter(s -> !s.isEmpty()).sorted().forEach(System.out::println);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    // same as above but sorted by line length
    try (var lines = Files.lines(Paths.get("resources/alice30.txt"))) {
      lines
        .limit(50)
        .map(String::trim)
        .filter(s -> !s.isEmpty())
        .sorted(Comparator.comparingInt(String::length))
        .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
