package com.thuanfpt.coban;

import java.util.Scanner;

public class GPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Enter an integer: ");
                arr[i] = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // consume the invalid input
                i--; // retry the current index
            }
        }
        int i = 0;
        for (int item : arr) {
            System.out.println("item index " + i + " = " + item + "|");
            i++;
        }
    }
}
