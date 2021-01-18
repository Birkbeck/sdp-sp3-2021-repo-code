package ch11.sec04;

public class RuntimeAnnotationDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(new Point(10, 10), 20, 30);
        System.out.println(ToStrings.toString(rect));
    }
}
