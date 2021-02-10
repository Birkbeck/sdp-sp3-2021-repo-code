package streams;

/**
 * @version 1.01 2018-05-01
 * @author Cay Horstmann modified by KLM
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class CountLongWords {
  public static void main(String[] args) throws IOException {
    var contents = Files.readString(Paths.get("resources/gutenberg/warpeace.txt"));
    List<String> words = List.of(contents.split("\\PL+"));

    Instant start = Instant.now();
    long count = 0;
    for (String w : words) {
      if (w.length() > 12) count++;
    }
    System.out.println(count);

    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();
    System.out.printf("Result %d, Elapsed time: %d ms\n", count, timeElapsed);

    start = Instant.now();
    count = words.stream().filter(w -> w.length() > 12).count();
    System.out.println(count);
    finish = Instant.now();
    timeElapsed = Duration.between(start, finish).toMillis();
    System.out.printf("Result %d, Elapsed time: %d ms\n", count, timeElapsed);

    start = Instant.now();
    count = words.parallelStream().filter(w -> w.length() > 12).count();
    System.out.println(count);
    finish = Instant.now();
    timeElapsed = Duration.between(start, finish).toMillis();
    System.out.printf("Result %d, Elapsed time: %d ms\n", count, timeElapsed);
  }
}
