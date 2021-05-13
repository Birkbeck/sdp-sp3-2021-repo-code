package fp;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    static Integer longCalculation(Integer x) {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException ignored) {
        }
        return x * 2;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> f = Main::longCalculation;
        Function<Integer, Integer> g = Memoizer.memoize(f);

        long startTime = System.currentTimeMillis();
        Integer result1 = g.apply(1);
        long time1 = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        Integer result2 = g.apply(1);
        long time2 = System.currentTimeMillis() - startTime;

        System.out.println(result1);
        System.out.println(time1);
        System.out.println();
        System.out.println(result2);
        System.out.println(time2);
    }
}
