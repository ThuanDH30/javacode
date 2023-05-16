package com.thuanfpt.coban;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class Fibonasi {
    public static void main(String[] args) {
      int n, fib1 = 0, fib2 = 1, fib3 = 1;
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Nhập vào số nguyên n (n <= 20): ");
      n = scanner.nextInt();
      
      if (n <= 0 || n > 20) {
         System.out.println("Số n không hợp lệ!");
      } else if (n == 1) {
         System.out.println("Số Fibonacci ứng với n là: " + fib1);
      } else if (n == 2) {
         System.out.println("Số Fibonacci ứng với n là: " + fib2);
      } else {
         for (int i = 3; i <= n; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
         }
         System.out.println("Số Fibonacci ứng với n là: " + fib3);
      }
   }
}

