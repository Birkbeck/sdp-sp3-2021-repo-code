```
// @FunctionalInterface - annotation to use on Single Abstract Method interfaces
// default methods introduced to assist with retro-fitting API's.
// Secondary role is Java Lambdas.

// java.util.function

// Consumer<T>
// Function<T,R>
// Predicate<T>
// Supplier<T>
// UnaryOperator<T>

// x -> x * x --- parameter -> expression
// s -> { System.out.println(s); } --- parameter -> block
// (x,y) -> Math.sqrt(x*x + y*y) --- (parameters) -> expression
// (s1,s2) -> { System.out.println(s1 + "," + s2); } --- (parameters) -> block
// (double x, double y) -> Math.sqrt(x*x + y*y)
// (List<?> lst -> { Arrays.shuffle(lst); Arrays.sort(lst); }

// s -> {System.out.println(s);}
// System.out::println
// var sout = System.out::println

// Constructor in Java lambdas
// Person::new
// String[]::new
// ...

// Function<String,Integer>

// s -> Integer.parseInt(s)
// (String s) -> Integer.parseInt(s)
// Integer::parseInt
// Integer::new
// String::length

// new Function<String,Integer(){
//  public Integer apply(String s) {
//    return s.length();
//  }
// }
```