package ch01.sec07;

import java.util.*;

public class WhileDemo {
   public static void main(String[] args) {
      Random generator = new Random();
      int sum = 0;
      int count = 0;
      int target = 90;
      while (sum < target) {
         int next = generator.nextInt(10);
         sum = sum + next;
         count++;
      }
      System.out.println("After " + count 
         + " iterations, the sum is " + sum);
   }
}
