package ch04.sec01;

public class StudentDemo {
    public static void main(String[] args) {
        Person p = new Student("Fred", 1729); // OK, a concrete subclass
        System.out.println(p.getName());
        Student s = (Student) p;
        System.out.println(s.getName());
        Named n = s;
        System.out.println(n.getName());
    }
}
