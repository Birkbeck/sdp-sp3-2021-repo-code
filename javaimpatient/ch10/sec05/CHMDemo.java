package ch10.sec05 ;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CHMDemo {
    public static ConcurrentHashMap<String, Long> map = new ConcurrentHashMap<>();

    public static void process(Path path) {
        try {
            String contents = Files.readString(path);
            for (String word : contents.split("\\PL+")) {
                map.merge(word, 1L, Long::sum);
                // or map.compute(word, (k, v) -> v == null ? 1 : v + 1);
                /* or
                map.putIfAbsent(word, 0L);
                Long oldValue, newValue;
                do {
                    oldValue = map.get(word);
                    newValue = oldValue + 1;
                } while (!map.replace(word, oldValue, newValue));                                
                */
                /* but not
                Long oldValue = map.get(word);
                Long newValue = oldValue == null ? 1 : oldValue + 1;
                map.put(word, newValue); // Error—might not replace oldValue                                
                */
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Set<Path> descendants(Path p) throws IOException {        
        try (Stream<Path> entries = Files.walk(p)) {
            return entries.filter(Files::isRegularFile).collect(Collectors.toSet());
        }
    }
    
    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(processors);
        Path pathToRoot = Paths.get(".");
        for (Path p : descendants(pathToRoot)) {
            executor.execute(() -> process(p));
        }        
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println(map);
    }
}
