package ch10.sec07;

public class Counter {
    private int value;
    public synchronized int increment() {
        value++;
        return value;
    }
}