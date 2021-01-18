package ch01.sec08;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[10];
        for (int i = 0; i < names.length / 2; i++) {
            names[i] = "";
        }
        names[0] = "Fred";
        names[1] = names[0];
        System.out.println("names="+Arrays.toString(names));
        
        int[] primes = { 17, 19, 23, 29, 31 };
        primes = new int[] { 2, 3, 5, 7, 11, 13 };
        
        // Enhanced for loop
        int sum = 0;
        for (int n : primes) {
            sum += n;
        }
        
        System.out.println("sum=" +sum);
        
        // Aliasing and copying
        int[] numbers = primes;
        numbers[5] = 42; // Also changes primes
        System.out.println("primes=" + Arrays.toString(primes));
        
        primes[5] = 13;
        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);
        copiedPrimes[5] = 31; // Doesn't change primes
        System.out.println("primes=" + Arrays.toString(primes));
        System.out.println("copiedPrimes=" + Arrays.toString(copiedPrimes));
    }
}
