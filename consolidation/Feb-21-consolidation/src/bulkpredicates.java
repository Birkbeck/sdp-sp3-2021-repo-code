import java.util.List;

public class bulkpredicates {
  public static void main(String[] args) {
    List<String> stringList = List.of("another", "different", "list", "of", "longish", "words"); // factory method

    System.out.println(stringList.stream().allMatch(s -> s.length() == 4));
    System.out.println(stringList.stream().anyMatch(s -> s.length() == 4));
  }
}
