package ch04.sec02;

public class Employee {
    private String name;
    private double salary;
        
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }
    
    public final String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String toString() {
        return getClass().getName() + "[name=" + name
            + ",salary=" + salary + "]";
    }
    
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
