# “favor composition over inheritance”

If you want to follow the rule of “favor composition over inheritance” 
that’s something Java does not really help with, verbosity wise. 
If you want to compose objects, you’d typically need to write delegating 
method calls all over the place.

Lombok proposes a solution for this via `@Delegate`.

## Example

Imagine that we want to introduce a new concept of `ContactInformation`. 
This is some information our `User` has and we may want other classes to have too.