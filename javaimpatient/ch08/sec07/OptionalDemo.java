package ch08.sec07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class User
{    
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {        
        return name;
    }
    
    private String id;
    private String name;
}

class Users {
    private static User[] users = {
            new User("gboole", "George Boole"),
            new User("achurch", "Alonzo Church"),
            new User("hcurry", "Haskell Curry")
    };
    
    public static Optional<User> lookup(String id) {
        return Stream.of(users).filter(u -> u.getId().equals(id)).findFirst();
    }    
    
    public static User classicLookup(String id) {
        for (User u : users) {
            if (u.getId().equals(id)) return u;
        }
        return null;
    }
}

public class OptionalDemo {
    
    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
        System.out.print(title + ": ");
        if (firstElements.size() <= SIZE)
            System.out.println(firstElements);
        else {
            firstElements.remove(SIZE);
            String out = firstElements.toString();
            System.out.println(out.substring(0, out.length() - 1) + ", ...]");
        }
    }
    
    public static void main(String[] args) throws IOException {
        String contents = Files.readString(Paths.get("alice.txt"));
        List<String> wordList = List.of(contents.split("\\PL+"));

        Optional<String> optionalValue = wordList.stream().filter(s -> s.contains("fred"))
                .findFirst();
        System.out.print(optionalValue.orElse("No word") + " contains fred");

        Optional<String> optionalString = Optional.empty();
        String result = optionalString.orElse("N/A");
        System.out.println("result: " + result);
        result = optionalString.orElseGet(() -> System.getProperty("user.dir"));
        System.out.println("result: " + result);
        try {
            result = optionalString.orElseThrow(IllegalStateException::new);
            System.out.println("result: " + result);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        Optional<String> result2 = optionalString.or(() ->
            Optional.ofNullable(System.getProperty("myapp.default")));
        System.out.println("result2: " + result2);
        
        optionalValue = wordList.stream().filter(s -> s.contains("red")).findFirst();
        optionalValue.ifPresent(s -> System.out.println(s + " contains red"));
        
        optionalValue = wordList.stream().filter(s -> s.contains("blue")).findFirst();
        optionalValue.ifPresentOrElse(
                s -> System.out.println(s + " contains blue"),
                () -> System.out.println("Nothing contains blue"));
        
        Set<String> results = new HashSet<>();
        optionalValue.ifPresent(results::add);
        Optional<Boolean> added = optionalValue.map(results::add);
        System.out.println("added: " + added);

        System.out.println(inverse(4.0).flatMap(OptionalDemo::squareRoot));
        System.out.println(inverse(-1.0).flatMap(OptionalDemo::squareRoot));
        System.out.println(inverse(0.0).flatMap(OptionalDemo::squareRoot));
        Optional<Double> result3 = Optional.of(-4.0).flatMap(OptionalDemo::inverse)
                .flatMap(OptionalDemo::squareRoot);
        System.out.println("result3: " + result3);
        
        Stream<String> ids = Stream.of("gboole", "jgosling");
        Stream<User> users = ids.map(Users::lookup)
            .filter(Optional::isPresent)
            .map(Optional::get);
        show("users", users);
        
        ids = Stream.of("gboole", "jgosling");
        users = ids.map(Users::lookup)
                .flatMap(Optional::stream);
        show("users", users);
        
        ids = Stream.of("gboole", "jgosling");
        users = ids.map(Users::classicLookup)
                .filter(Objects::nonNull);
        show("users", users);
        
        ids = Stream.of("gboole", "jgosling");
        users = ids.flatMap(
                id -> Stream.ofNullable(Users.classicLookup(id)));
        show("users", users);
        
        ids = Stream.of("gboole", "jgosling");
        users = ids.map(Users::classicLookup)
                .flatMap(Stream::ofNullable);
        show("users", users);
    }

    public static Optional<Double> inverse(Double x) {
        return x == 0 ? Optional.empty() : Optional.of(1 / x);
    }

    public static Optional<Double> squareRoot(Double x) {
        return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
    }
}
