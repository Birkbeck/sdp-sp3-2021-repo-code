package loopstostreams;

import java.util.List;

public class Article {
  private final String title;
  private final String author;
  private final List<String> tags;

  public Article(String title, String author, List<String> tags) {
    this.title = title;
    this.author = author;
    this.tags = tags;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public List<String> getTags() {
    return tags;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder(); // Builder design pattern
    sb.append("Title: ")
      .append(getTitle())
      .append(" Author: ")
      .append(getAuthor())
      .append(" Tags: ")
      .append(getTags());
    return sb.toString();
  }
}
