package ch03.sec02;

public interface IntSequence {
    default boolean hasNext() { return true; };
    int next();
}