package ch04.sec01;

public class InheritanceDemo {
    public static void main(String[] args) {
        Manager boss = new Manager("Fred", 200000);
        boss.setBonus(10000); // Defined in subclass
        System.out.println(boss.getSalary());
        boss.raiseSalary(5); // Inherited from superclass
        System.out.println(boss.getSalary());        
        Employee empl = boss; // Ok to convert to superclass
        empl.raiseSalary(5); // Can still apply superclass methods
        System.out.println(empl.getSalary()); // Calls Manager.getSalary
        
        if (empl instanceof Manager) {
            Manager mgr = (Manager) empl;
            mgr.setBonus(20000);
        }
    }
}