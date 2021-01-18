package ch07.sec05;

public class Job implements Comparable<Job> {
    private int priority;
    private String description;
    
    public Job(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int compareTo(Job other) {
        return priority - other.priority;
    }
    
    public String getDescription() {
        return description;
    }
}
