package loopstostreams;

import java.util.*;
import java.util.stream.Collectors;

public class Articles {
  private List<Article> articles;

  public Articles(List<Article> arr) {
    // articles = arr; = bad!
    articles = new ArrayList<>();
    for (Article a : arr) {
      articles.add(a);
    }
  }

  // looking for the string "Java" using a loop
  public Article getFirstJavaArticleLoop() {
    for (Article article : articles) {
      if (article.getTags().contains("Java")) {
        return article;
      }
    }
    return null;
  }

  // using Optional and Streams
  public Optional<Article> getFirstJavaArticleStream() {
    return articles.stream()
      .filter(article -> article.getTags().contains("Java"))
      .findFirst();
  }

  // all the elements that match instead of just the first

  public List<Article> getAllJavaArticlesLoop() {
    List<Article> result = new ArrayList<>();

    for (Article article : articles) {
      if (article.getTags().contains("Java")) {
        result.add(article);
      }
    }
    return result;
  }

  public List<Article> getAllJavaArticlesStream() {
    return articles.stream()
      .filter(article -> article.getTags().contains("Java"))
      .collect(Collectors.toList());
  }

  // group all the articles based on the author

  public Map<String, List<Article>> groupByAuthorLoop() {
    Map<String, List<Article>> result = new HashMap<>();

    for (Article article : articles) {
      if (result.containsKey(article.getAuthor())) {
        result.get(article.getAuthor()).add(article);
      } else {
        List<Article> articles = new ArrayList<>();
        articles.add(article);
        result.put(article.getAuthor(), articles);
      }
    }
    return result;
  }

  public Map<String, List<Article>> groupByAuthorStream() {
    return articles.stream()
      .collect(Collectors.groupingBy(Article::getAuthor));
  }

  // find all the different tags used in the collection

  public Set<String> getDistinctTagsLoop() {
    Set<String> result = new HashSet<>();

    for (Article article : articles) {
      result.addAll(article.getTags());
    }
    return result;
  }

  public Set<String> getDistinctTagsStream() {
    return articles.stream()
      .flatMap(article -> article.getTags().stream())
      .collect(Collectors.toSet());
  }
}
