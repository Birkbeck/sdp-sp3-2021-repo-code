package ch01.sec09;

import java.util.Scanner;

public class StaticMethodDemo {
    public static double average(double x, double y) {
        double sum = x + y;
        return sum / 2;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double result = average(a, b);
        System.out.println("Average: " + result);
    }
}