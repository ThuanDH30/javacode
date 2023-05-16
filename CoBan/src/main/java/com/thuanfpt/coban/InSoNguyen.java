package com.thuanfpt.coban;
import java.util.Scanner;
import java.lang.Math;

public class InSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();

        boolean isPrime = true;
        if(n < 2) {
            isPrime = false;
        } else {
            int sqrtN = (int) Math.sqrt(n);
            for(int i = 2; i <= sqrtN; i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai so nguyen to");
        }
    }
}
