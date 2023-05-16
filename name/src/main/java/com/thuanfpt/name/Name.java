/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thuanfpt.name;
import java.util.Scanner;
import java.lang.StringIndexOutOfBoundsException;
/**
 *
 * @author Bravo
 */
public class Name {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten:");
        String name = sc.next();
        System.out.println("nhap tuoi:");
        int age = sc.nextInt();
        System.out.println("nhap lop:");
        String className = sc.next();
        sc.nextLine(); 
        System.out.println("nhap dia chi:");
        String address = sc.nextLine(); 
        System.out.println("nhap gioi tinh:");
        char gender = sc.nextLine().charAt(0);
        String genderValue; 
        if (gender == 'F') {
            genderValue = "Female";
        } else if (gender == 'M') {
            genderValue = "Male";
        } else {
            genderValue = "Unknown";
        }
        System.out.println("Gender is: " + genderValue);
        System.out.println("Hello World!");
        System.out.println("ten:" + name);
        System.out.println("tuoi:" + age);
        System.out.println("lop:" + className);
        System.out.println("gioi tinh:" + genderValue); 
        System.out.println("dia chi:" + address);
    }
}