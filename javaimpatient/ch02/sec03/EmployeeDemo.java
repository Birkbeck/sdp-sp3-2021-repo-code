package ch02.sec03;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee james = new Employee("James Bond", 500000);
            // calls Employee(String, double) constructor
        Employee anonymous = new Employee("", 40000);
            // calls Employee(double) constructor
        Employee unpaid = new Employee("Igor Intern");
        Employee e = new Employee();
            // no-arg constructor
    }
}
