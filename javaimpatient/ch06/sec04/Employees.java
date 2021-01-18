package ch06.sec04;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employees {
    public static void printNames(ArrayList<? extends Employee> staff) {
        for (int i = 0; i < staff.size(); i++) {
            Employee e = staff.get(i);
            System.out.println(e.getName());
        }
    }
    
    public static void printAll1(Employee[] staff, Predicate<Employee> filter) {
        for (Employee e : staff) 
            if (filter.test(e))
                System.out.println(e.getName());
    }

    public static void printAll2(Employee[] staff, Predicate<? super Employee> filter) {
        for (Employee e : staff) 
            if (filter.test(e))
                System.out.println(e.getName());
    }
    
    public static void main(String[] args) {
        Employee[] employees = {
          new Employee("Fred", 50000),
          new Employee("Wilma", 60000),
        };
        printAll1(employees, e -> e.getSalary() > 100000);
        printAll2(employees, e -> e.getSalary() > 100000);
        Predicate<Object> evenLength = e -> e.toString().length() % 2 == 0; 
        // printAll1(employees, evenLength);
        printAll2(employees, evenLength);
    }
}
