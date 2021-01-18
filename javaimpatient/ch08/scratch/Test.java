package ch08.scratch;

import java.util.stream.*;

public class Test {
    private static int prev;
    public static void main(String[] args) {
        Stream<Integer> values = Stream.of(1, 2, 2, 3, 3, 3, 4, 2);
        values = values.filter( x -> { 
            boolean r = prev != x; 
            prev = x; 
            return r; })
                .peek(x -> { return; });
        values.forEach(System.out::println);
    }
}
