package ch10.sec08;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadLocalDemo {
    public static final NumberFormat sharedFormatter 
        = NumberFormat.getCurrencyInstance(); // BAD
    public static final ThreadLocal<NumberFormat> currencyFormat 
        = ThreadLocal.withInitial(() -> NumberFormat.getCurrencyInstance()); // GOOD
    
    public static String asCurrency(double value) {
        NumberFormat formatter = currencyFormat.get();
        // formatter = sharedFormatter
        // Try this to see what happens...
        return formatter.format(value);
    }
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newCachedThreadPool();
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i < 100; i++) {        
            double value = 1000.01 * i;;
            tasks.add(() -> asCurrency(value));
        }
        List<Future<String>> result = executor.invokeAll(tasks);
        for (Future<String> f : result) 
            System.out.println(f.get());
    }
}