package streams;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamClass {
    public static void main(String[] args) {
        Stream<String> a = Stream.of("one", "three", "five");
        Stream<String> b = Stream.of("two", "four", "six");

        Stream<String> out = interleave(a, b);
        out.forEach(System.out::println);
    }

    public static <T> Stream<T> interleave(Stream<T> streamA, Stream<T> streamB) {
        return zip(streamA, streamB, (o1, o2) -> Stream.of(o1, o2)).flatMap(s -> s);
    }

    private static <A, B, C> Stream<C> zip(Stream<A> streamA, Stream<B> streamB, BiFunction<A, B, C> zipper) {
        final Iterator<A> iterA = streamA.iterator();
        final Iterator<B> iterB = streamB.iterator();
        final Iterator<C> iterC = new Iterator<C>() {
            @Override
            public C next() {
                return zipper.apply(iterA.next(), iterB.next());
            }

            @Override
            public boolean hasNext() {
                return iterA.hasNext() && iterB.hasNext();
            }
        };

        final boolean parallel = streamA.isParallel() || streamB.isParallel();
        return iteratorToFiniteStream(iterC, parallel);
    }

    private static <T> Stream<T> iteratorToFiniteStream(Iterator<T> iterator, boolean parallel) {
        final Iterable<T> iterable = () -> iterator;
        return StreamSupport.stream(iterable.spliterator(), parallel);
    }


}
