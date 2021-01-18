package ch06.sec04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeapPollutionDemo {
    public static void demo(List<String> words) {
        List<?> elements = words;
        System.out.println("Cast to List<Integer>");
        @SuppressWarnings("unchecked")
        List<Integer> numbers = (List<Integer>) elements;
        System.out.println("Success");
        System.out.println("Inserting an integer");
        numbers.add(42);
        System.out.println("Success");
        System.out.println("Removing it as a string");
        String word = words.get(0);
        System.out.println("Success");
        System.out.println(word);
    }

    public static void main(String[] args) {
        try {
            demo(new ArrayList<>());
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        try {
            demo(Collections.checkedList(new ArrayList<>(), String.class));
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }
}
