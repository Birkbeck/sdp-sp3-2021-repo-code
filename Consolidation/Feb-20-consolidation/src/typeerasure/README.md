## Reifiable Types

Means that the information on types is retained at runtime.

Java does not meet this requirement as it only retains 
full type information at compile time.

Java prior to Java 5 (1.5) did not have generics (parametric polymorphism).
Whilst the type information is available in the bytecode file the runtime does not exploit this for reasons of backward compatibility.

### Type Erasure for Java

+ Replace all type parameters in generic types with their upperbound or `Object`.
+ The resulting bytecode contains only ordinary classes, interfaces, and methods.
+ Type casts are inserted as required.
+ Bridge methods are generated for the corner cases.
