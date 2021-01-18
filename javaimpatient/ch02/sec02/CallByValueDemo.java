package ch02.sec02;

public class CallByValueDemo {
    public static void main(String[] args) {
        EvilManager boss = new EvilManager();
        
        Employee fred = new Employee("Fred", 50000);
        System.out.println("Salary before: " + fred.getSalary());            
        boss.giveRandomRaise(fred);
        System.out.println("Salary after: " + fred.getSalary());

        double sales = 100000;
        System.out.println("Sales before: " + sales);
        boss.increaseRandomly(sales);
        System.out.println("Sales after: " + sales);
        
        System.out.println("Employee before: " + fred.getName());            
        boss.replaceWithZombie(fred);
        System.out.println("Employee after: " + fred.getName());            
    }
}
