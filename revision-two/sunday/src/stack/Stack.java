package stack;

import java.util.Optional;

/**
 * The Stack class represents a last-in-first-out (LIFO) stack of objects.
 */
public interface Stack<T> {

    /**
     * Tests if this stack is empty.
     *
     * @return if the stack is empty
     */
    boolean isEmpty();

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return the object at the top of the stack
     */
    Optional<T> peek();

    /**
     * Removes the object at the top of this stack and returns that object as
     * the value of this function.
     *
     * @return object at the top of the stack
     */
    Optional<T> pop();

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item
     */
    void push(T item);
}