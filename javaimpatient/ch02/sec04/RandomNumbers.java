package ch02.sec04;

import java.util.Random;

public class RandomNumbers {
    private static Random generator = new Random();
    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
            // Ok to access the static generator variable
    }
}