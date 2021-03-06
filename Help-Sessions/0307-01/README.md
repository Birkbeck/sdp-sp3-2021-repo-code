# SOLID

+ Shapes example to illustrate the use of the above principles.

+ **S** - Single Responsibility as shown by `Rectangle` and `getAreaOfRectangles`.
+ **O** - Open/Closed principle - "Open" for extension/ "Closed" for modification.
  Existing `AreaCalculator` would need to be modified to incorporate new shapes.
+ **L** - Liskov Substitution Principle - subtypes should be able to replace base types.  
The concept of a `Bird`: a bird can fly; but a `Penguin`, which is bird, can't fly.  
Therefore, we should split `Bird` into multiple interfaces to enable `Penguin` to be represented.
+ **I** - Interface Segregation Principle - a type should not have to depend/implement an interface that it 
  does not require/use.
+ **D** - Dependency Inversion Principle - Entities must depend on abstractions not concrete instantiations 
  (interfaces over classes).
  