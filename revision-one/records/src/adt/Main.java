package adt;

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle(new Point(0,0), 3);
        System.out.println(s);
    }
}

// The following are prohibited:

// record Square extends Rectangle {}

// record Square implements Shape {}