package ch02.sec03;

import java.util.Random;

public class Employee {
    private String name = "";
    private double salary;
    private final int id;
        
    { // An initialization block
        Random generator = new Random(); 
        id = 1 + generator.nextInt(1_000_000);
    }
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public Employee(double salary) {
        // name already set to ""
        this.salary = salary;
    }        
    
    public Employee(String name) {
        // salary automatically set to zero
        this.name = name;
    } 
    
    public Employee() {
        this("", 0);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public int getId() {
        return id;
    }
}
