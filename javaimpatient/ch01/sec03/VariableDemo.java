package ch01.sec03;

import java.util.Random;

public class VariableDemo {
    public static final int DAYS_PER_YEAR = 365;
    
    enum Weekday { MON, TUE, WED, THU, FRI, SAT, SUN };
    
    public static void main(String[] args) {
        int total = 0;
        int i = 0, count;
        Random generator = new Random();
        double lotsa$ = 1000000000.0; // Legal, but not a good idea
        double élévation = 0.0;
        double π = 3.141592653589793;
        String Count = "Dracula"; // Not the same as count
        int countOfInvalidInputs = 0; // Example of camelCase
        final int DAYS_PER_WEEK = 7;
        Weekday startDay = Weekday.MON;
        // The following line would cause an error since count has not been initialized
        // System.out.println(count); 
    }
}
