package ch10.sec07;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FlagDemo {
    private static Flag done = new Flag();
    
    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 1; i <= 1000; i++) 
                System.out.println("Hello " + i);
            done.set();
        };
        Runnable goodbye = () -> {
            int i = 1;
            while (!done.get()) i++; 
            System.out.println("Goodbye " + i);
        };
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);        
        executor.execute(goodbye);        
    }
}