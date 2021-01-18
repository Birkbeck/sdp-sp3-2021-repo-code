package ch07.sec02;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> friends = new LinkedList<>();
        ListIterator<String> iter = friends.listIterator();
        iter.add("Fred"); // Fred |
        iter.add("Wilma"); // Fred Wilma |
        iter.previous(); // Fred | Wilma
        iter.set("Barney"); // Fred | Barney
        System.out.println(friends);
    }
}
