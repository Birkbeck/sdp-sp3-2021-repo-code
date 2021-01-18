package ch10.sec01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CallableDemo {
    public static long occurrences(String word, Path path) {
        try {
            String contents = Files.readString(path);
            return Pattern.compile("\\PL+")
                    .splitAsStream(contents)
                    .filter(Predicate.isEqual(word))
                    .count();
        } catch (IOException ex) {
            return 0;
        }
    }
    
    public static Set<Path> descendants(Path p) throws IOException {        
        try (Stream<Path> entries = Files.walk(p)) {
            return entries.collect(Collectors.toSet());
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        String word = "String";
        Set<Path> paths = descendants(Paths.get("."));
        List<Callable<Long>> tasks = new ArrayList<>();
        for (Path p : paths) tasks.add(
            () -> { return occurrences(word, p); });
        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(processors);
        List<Future<Long>> results = executor.invokeAll(tasks);
        long total = 0;
        for (Future<Long> result : results) total += result.get();
        System.out.println("Occurrences of String: " + total);
        
        String searchWord = "occurrences";
        List<Callable<Path>> searchTasks = new ArrayList<>();
        for (Path p : paths) searchTasks.add(
            () -> { if (occurrences(searchWord, p) > 0) return p; else throw new RuntimeException(); });
        Path found = executor.invokeAny(searchTasks);
        System.out.println(found);
        executor.shutdown();
    }
}
