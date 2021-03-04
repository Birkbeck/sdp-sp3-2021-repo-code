## Functional Interfaces (FI)

+ 40+ FI in `java.util.function`
+ In the following `T` and `R` are types:
    + `Consumer<T>` - takes a T returns nothing
    + `Function<T,R>` - takes a T and returns an R
    + `Predicate<T>` - takes a T and returns a boolean
    + `Supplier<T>` - returns something of type T
    + `UnaryOperator<T>` - accepts a T
    
## Lambda Syntax

+ parameter -> expression  
    `x -> x * x`
+ parameter -> block  
    `s -> { System.out.println(s); }`
+ (parameters) -> expression  
    `(x, y) -> Math.sqrt(x*x + y*y)`
+ (parameters) -> block  
  `(s1, s2) -> { System.out.println(s1 + "," + s2); }`
+ (parameter decls) -> expression  
    `(double x, double y) -> Math.sqrt(x*x + y*y)`
+ (parameter decls) -> block  
    `(List<?> lst -> { Arrays.shuffle(lst); Arrays.sort(lst);}`
  
## Method References

+ `obj::methodName`  
  `x -> System.out.println(x)`  
  `System.out::println`
+ `className::instanceMethod`  
  `String::length`
+ `className::staticMethod`  
  `Math::sin`
+ Constructor  
  `className::new`  
  e.g., `Integer::new` === `x -> new Integer(x)`  
  e.g., `String[]::new`
  
### Ways of obtaining `Function<String,Integer>`

+ Lambda  
    `s -> Integer.parseInt(s)`
+ Lambda with explicit parameter type information  
    `(String s) -> Integer.parseInt(s)`
+ `String::length`, `Integer::new`, `Integer::parseInt`

```java
/*class MyNewClass implements*/ new Function<String,Integer>(){
  public Integer apply(String s){
    return s.length();
  }
}
```