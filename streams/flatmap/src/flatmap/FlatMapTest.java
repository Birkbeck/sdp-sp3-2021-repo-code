package flatmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
  public static void main(String[] args) {

    List<Developer> team = new ArrayList<>();

    Developer polyglot = new Developer("Fred");
    polyglot.add("clojure");
    polyglot.add("scala");
    polyglot.add("groovy");
    polyglot.add("go");
    polyglot.add("java");

    System.out.println(polyglot);

    Developer busy = new Developer("Mary");
    busy.add("java");
    busy.add("javascript");

    System.out.println(busy);

    team.add(polyglot);
    team.add(busy);

    System.out.println(team);

    List<String> teamLanguages = team.stream() // List<String>
      .map(d -> d.getLanguages()) // before was List<List<String>>
      .flatMap(Collection::stream)
      .distinct()
      .collect(Collectors.toList());

    System.out.println(teamLanguages);
  }
}
