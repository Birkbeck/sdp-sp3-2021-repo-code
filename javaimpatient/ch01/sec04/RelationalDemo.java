package ch01.sec04;

public class RelationalDemo {
    public static void main(String[] args) {
        int length = 10;
        int n = 7;
        System.out.println(0 <= n && n < length);
        
        // Short circuit evaluation
        int s = 30;
        System.out.println(n != 0 && s + (100 - s) / n < 50);
        n = 0;
        System.out.println(n != 0 && s + (100 - s) / n < 50);
        System.out.println(n == 0 || s + (1 - s) / n >= 50);
        
        int time = 7;
        System.out.println(time < 12 ? "am" : "pm");
    }
}
