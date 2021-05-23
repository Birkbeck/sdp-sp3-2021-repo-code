import java.util.List;
import java.util.stream.Collectors;

class MainTwo {
  public static void main(String[] args) {
    List<Integer> listOne = List.of(1, 2, 3);
    List<Integer> listTwo = List.of(3, 4);

    List<List<Integer>> result = listOne.stream()
      .flatMap(i -> listTwo.stream()
        .filter(j -> (i + j) % 3  == 0)
        .map(j -> List.of(i,j)))
        .collect(Collectors.toList());
    result.stream().forEach(item -> 
      System.out.println(item + " "));

  }
}