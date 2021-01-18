package ch07.sec06;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class RangeDemo {
    public static void main(String[] args) {
        List<String> sentence = List.of("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal, Panama!".split("[ ,]+"));
        List<String> nextFive = sentence.subList(5, 10);
        System.out.println(nextFive);
        
        TreeSet<String> words = new TreeSet<>(sentence);
        words.add("zebra");
        SortedSet<String> ysOnly = words.subSet("y", "z");
        System.out.println(ysOnly);
        
        SortedSet<String> nAndBeyond = words.tailSet("p");
        System.out.println(nAndBeyond);
    }
}
