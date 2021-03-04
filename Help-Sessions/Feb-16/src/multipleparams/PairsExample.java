package multipleparams;

class PairsExample {
  public static void main(String[] args) {
    Pairs<Integer, Integer> pi = new Pairs<>(3, 4);
    Pairs<Integer, String> ps = new Pairs<>(4, "a string");
  }
}

class Pairs<T, S> {
  public T first;
  public S second;

  public Pairs(T a, S b) {
    first = a;
    second = b;
  }
}

