/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thuanfpt.arr;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class Arr {
    public static void main(String[] args) {
         int[] arr = inputArray(); 
        sortAndPrint(arr); 
    }
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich co mang: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void sortAndPrint(int[] arr) {
        Arrays.sort(arr);
        System.out.print("sau khi sap xep: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
        