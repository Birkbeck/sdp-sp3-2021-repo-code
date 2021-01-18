package ch06.sec05;

import java.util.ArrayList;

public class WordListDemo {
    public static void main(String[] args) {
        WordList words = new WordList();
        ArrayList<String> strings = words; // Ok—conversion to superclass
        strings.add("Hello");
        strings.add("C++");
        System.out.println(words);
    }
}
