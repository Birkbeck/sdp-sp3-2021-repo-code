import java.util.function.Function;

class Main {

  public static void main(String[] args) {
    Function<Integer, String> getText = num -> {
      String[] days = { "Mon", "Tue", "Wed" };

      return (num > 0 && num <= days.length) ? days[num - 1] : "??";
    };
    System.out.println(getText.apply(3));

    Function<Integer, Function<Integer, Function<Integer, Integer> > >
     curriedAdd = a -> b -> c -> a + b + c;

    System.out.println("Add 1,2,3: " + curriedAdd.apply(1).apply(2).apply(3));

    var addTwoNumbers = curriedAdd.apply(1);

    System.out.println(addTwoNumbers.apply(2).apply(3));
  }

  // public static addThree(int a, int b , int c){
  // return a + b + c;
  // }

}