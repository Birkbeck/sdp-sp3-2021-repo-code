package ch01.sec05;

import java.time.ZoneId;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String location = "Java";
        String greeting = "Hello " + location;
        System.out.println(greeting);
        int age = 42;
        String output = age + " years";
        System.out.println(output);
        
        System.out.println("Next year, you will be " + age + 1); // Error
        System.out.println("Next year, you will be " + (age + 1)); // Ok
        
        String names = String.join(", ", "Peter", "Paul", "Mary");
        System.out.println(names);
        
        // String builder
        
        StringBuilder builder = new StringBuilder();
        for (String id : ZoneId.getAvailableZoneIds()) {
            builder.append(id);
            builder.append(", ");
        }
        String result = builder.toString();
        System.out.println(result.substring(0, 200) + "...");
        System.out.println(result.length());
        
        // Substring
        
        greeting = "Hello, World!";
        location = greeting.substring(7, 12);
        System.out.println(location);
        
        // Equality testing
        
        System.out.println(location.equals("World"));
        System.out.println(location == "World");
        System.out.println(location.equalsIgnoreCase("world"));
        System.out.println("word".compareTo("world"));

        // Converting between numbers and strings
        int n = 42;
        String str = Integer.toString(n, 2);
        System.out.println(str);
        
        n = Integer.parseInt(str);
        System.out.println(n);
        n = Integer.parseInt(str, 2);
        System.out.println(n);
        double x = Double.parseDouble("3.14"); 
        System.out.println(x);
        
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting); // greeting is not changed
        
        // Unicode
        String javatm = "Java\u2122";
        System.out.println(javatm);
        System.out.println(Arrays.toString(javatm.codePoints().toArray()));
        System.out.println(javatm.length());
        
        String octonions = "\ud835\udd46";
        System.out.println(octonions);
        System.out.println(Arrays.toString(octonions.codePoints().toArray()));
        System.out.println(octonions.length()); // Counts code units, not Unicode code points
    }
}
