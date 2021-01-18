package ch09.sec05;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private double salary;
    private Manager boss;
        
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }
    
    public void setBoss(Manager boss) {
        this.boss = boss;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String toString() {
        return String.format("%s[name=%s,salary=%.2f,boss=%s]", 
                getClass().getName(), name, salary, boss);
    }
}
