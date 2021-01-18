package ch07.sec02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Peter");
        coll.add("Paul");
        coll.add("Mary");
        Iterator<String> iter = coll.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            process(element);
        }
        
        iter = coll.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            if (element.startsWith("M"))
                iter.remove();
        } 
        
        coll.removeIf(e -> e.endsWith("r"));
        
        for (String element : coll) 
            process(element);
    }
    
    public static void process(String s) { System.out.println("Processing " + s); }
}
