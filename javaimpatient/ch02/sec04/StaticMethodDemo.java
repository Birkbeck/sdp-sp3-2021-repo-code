package ch02.sec04;

import java.text.NumberFormat;

public class StaticMethodDemo {
    public static void main(String[] args) {
        int dieToss = RandomNumbers.nextInt(1, 6); 
        System.out.println(dieToss);
        
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x)); // Prints $0.10
        System.out.println(percentFormatter.format(x)); // Prints 10%
    }
}
