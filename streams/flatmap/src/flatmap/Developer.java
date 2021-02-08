package flatmap;

import java.util.HashSet;
import java.util.Set;

public class Developer {
  private String name;
  private Set<String> languages;

  {
    languages = new HashSet<>();
  }

  public Developer(String name) {
    this.name = name;
  }

  public void add(String language) {
    this.languages.add(language);
  }

  public Set<String> getLanguages() {
    return languages;
  }

  @Override
  public String toString() {
    return languages.toString();
  }
}
