package loopstostreams;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ExamplesMain {
  public static void main(String[] args) {

    List<Article> articles = new ArrayList<>();
    articles.add(new Article("No real title", "SomeOne", List.of("never", "tags", "some")));
    articles.add(new Article("Java in title", "SomeOneElse", List.of("Java", "programming")));
    articles.add(new Article("No Swift title", "SomeOneOdd", List.of("never", "swift", "some")));
    articles.add(new Article("Another Java title", "SomeOne", List.of("Java", "tags", "some")));

    Articles ex = new Articles(articles);
    Article empty = new Article("", "", List.of());

    Instant start = Instant.now();
    System.out.println(ex.getFirstJavaArticleLoop());
    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toNanos();
    System.out.println("Elapsed time: " + timeElapsed);

    start = Instant.now();
    System.out.println(ex.getFirstJavaArticleStream().orElse(empty));
    finish = Instant.now();
    timeElapsed = Duration.between(start, finish).toNanos();
    System.out.println("Elapsed time: " + timeElapsed);

    System.out.println();

    start = Instant.now();
    System.out.println(ex.getAllJavaArticlesLoop());
    finish = Instant.now();
    timeElapsed = Duration.between(start, finish).toNanos();
    System.out.println("Elapsed time: " + timeElapsed);

    start = Instant.now();
    System.out.println(ex.getAllJavaArticlesStream());
    finish = Instant.now();
    System.out.println("Elapsed time: " + timeElapsed);

    System.out.println();

    start = Instant.now();
    System.out.println(ex.groupByAuthorLoop());
    finish = Instant.now();
    System.out.println("Elapsed time: " + timeElapsed);

    start = Instant.now();
    System.out.println(ex.groupByAuthorStream());
    finish = Instant.now();
    System.out.println("Elapsed time: " + timeElapsed);

    System.out.println();

    start = Instant.now();
    System.out.println(ex.getDistinctTagsLoop());
    finish = Instant.now();
    System.out.println("Elapsed time: " + timeElapsed);

    start = Instant.now();
    System.out.println(ex.getDistinctTagsStream());
    finish = Instant.now();
    System.out.println("Elapsed time: " + timeElapsed);
  }

}
