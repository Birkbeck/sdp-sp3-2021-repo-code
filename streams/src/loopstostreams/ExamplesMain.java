package loopstostreams;

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

//    System.out.println(ex.getFirstJavaArticleLoop());
//    System.out.println(ex.getFirstJavaArticleStream().orElse(empty));
//    System.out.println();
//    System.out.println(ex.getAllJavaArticlesLoop());
//    System.out.println(ex.getAllJavaArticlesStream());
//    System.out.println();
//    System.out.println(ex.groupByAuthorLoop());
//    System.out.println(ex.groupByAuthorStream());
//    System.out.println();
    System.out.println(ex.getDistinctTagsLoop());
    System.out.println(ex.getDistinctTagsStream());
  }

}
