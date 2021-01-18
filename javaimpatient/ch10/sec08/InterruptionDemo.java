package ch10.sec08;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterruptionDemo {
    public static BigInteger big(long value) { return BigInteger.valueOf(value); }
    public static BigInteger big(String value) { return new BigInteger(value); }
    
    public static BigInteger isPrime(BigInteger n) {
        BigInteger m = n;
        BigInteger a = big(2);
        while (a.multiply(a).compareTo(m) <= 0) { 
            if (Thread.currentThread().isInterrupted()) {
                System.err.println("Interrupted!");
                return null;
            }
            if (m.remainder(a).equals(big(0))) 
                throw new RuntimeException();
            else
                a = a.add(big(1));            
        }
        return n;
    }
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newCachedThreadPool();
        List<Callable<BigInteger>> tasks = new ArrayList<>();
        for (int i = 0; i < 100; i++) {        
            BigInteger n = big("10000000000").add(big(i));
            tasks.add(() -> isPrime(n));
        }
        BigInteger result = executor.invokeAny(tasks);
        System.out.println(result + " is prime");
    }
}