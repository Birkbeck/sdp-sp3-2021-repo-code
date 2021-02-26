# Questions

1. Eliminate side effects - side effects are things that change state.
   Output statement, updating a variable.  
   Immutability is a usual approach to eliminating side effects.  
   ```
   (String s) -> System.out.println(s) // does not eliminate side effects
   ```  
   Usually lambdas do afford immutability.
   Java lambdas *are not* "proper" lambdas as in Racket, JavaScript, etc.
   ```
   x' = (x) -> x + 1
   ```
2. Referential Transparency - same result regardless of means of achieving it (no side effects).
   ```
    3
    2 + 1
    ((x) -> x + 1) 2
    add2(1)
    ```
3. Immutable + referential transparency => concurrency/parallelism.  
   Consider adding up the values in a list.  
   [2,5,6,1,8,9,11,56,1,6,7]
   Iterate over the list summing the values OR  
   Split the list into parts, sum each part, sum the sub results.
   ```
   (x,y) -> (x + y) // fold or reduce
   ```
4. Parameters  
   ```java
   x -> x * x
   s -> { System.out.println(s);}
   (x,y) -> Math.sqrt(x*x + y*y)
   (s1,s2) -> { System.out.println(s1 + "," + s2);} 
   (double x, double y) -> Math.sqrt(x*x + y*y)
   (List<?> lst -> {Arrays.sort(lst);})
    ```
5. Method References  
   ```java
   object::method e.g., 
     System.out::println
     (s) -> System.out.println(s)
   classname::method
   classname::staticmethod
   classname::new
   
   e.g.,
      LinkedList<String>::new
      String[]::new
   ```
