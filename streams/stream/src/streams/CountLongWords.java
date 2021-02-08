package streams;

/**
 * @version 1.01 2018-05-01
 * @author Cay Horstmann
 */

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class CountLongWords {
  public static void main(String[] args) throws IOException {
    var contents = Files.readString(Paths.get("streams/resources/gutenberg/alice30.txt"));
    List<String> words = List.of(contents.split("\\PL+"));

//    Instant start = Instant.now();
    long count = 0;
    for (String w : words) {
      if (w.length() > 12) count++;
    }
    System.out.println(count);
    //    Instant finish = Instant.now();
    //    long timeElapsed = Duration.between(start, finish).toMillis();
    //    System.out.printf("Result %d, Elapsed time: %d ms\n", count, timeElapsed);

    //    start = Instant.now();
    count = words.stream().filter(w -> w.length() > 12).count();
    System.out.println(count);
    //    finish = Instant.now();
    //    timeElapsed = Duration.between(start, finish).toMillis();
    //    System.out.printf("Result %d, Elapsed time: %d ms\n", count, timeElapsed);

    //    start = Instant.now();
    count = words.parallelStream().filter(w -> w.length() > 12).count();
    System.out.println(count);
    //    finish = Instant.now();
    //    timeElapsed = Duration.between(start, finish).toMillis();
    //    System.out.printf("Result %d, Elapsed time: %d ms\n", count, timeElapsed);
  }
}
