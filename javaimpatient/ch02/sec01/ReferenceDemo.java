package ch02.sec01;

import java.util.ArrayList;

public class ReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
            // friends is empty
        friends.add("Peter");
            // friends has size 1
        ArrayList<String> people = friends;
            // Now people and friends refer to the same object
        people.add("Paul");
        System.out.println(friends);
    }
}
