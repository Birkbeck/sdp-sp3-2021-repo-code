package parallel;

import lambdas.StringLengthComparator;

import java.time.Duration;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    long sum = 0;
    long start = System.nanoTime();
    for (var j = 0; j < Integer.MAX_VALUE; j++){
      sum+= j;
    }
    long finish = System.nanoTime();
    System.out.println(sum + " in " + (finish - start) + " ns");

    start = System.nanoTime();
    sum = LongStream.range(0, Integer.MAX_VALUE).sum();
    finish = System.nanoTime();
    System.out.println(sum + " in " + (finish - start) + " ns");

    start = System.nanoTime();
    sum = LongStream.range(0, Integer.MAX_VALUE).parallel().sum();
    finish = System.nanoTime();
    System.out.println(sum + " in " + (finish - start) + " ns");

    Stream<String> stringStream = Stream.empty();

    // Not only Stream but also BaseStream interface
  }
}
