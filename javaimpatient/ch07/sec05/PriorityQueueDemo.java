package ch07.sec05;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Job> jobs = new PriorityQueue<>();
        jobs.add(new Job(4, "Collect garbage"));
        jobs.add(new Job(9, "Match braces"));
        jobs.add(new Job(1, "Fix memory leak"));
        
        while (jobs.size() > 0) {
            Job job = jobs.remove(); // The most urgent jobs are removed first
            execute(job);
        } 
    }
    
    public static void execute(Job job) {
        System.out.println(job.getDescription());
    }
}
