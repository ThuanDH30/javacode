/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thuanfpt.mavenproject4;

/**
 *
 * @author Bravo
 */
public class Mavenproject4 {
private static double grade= 8.99;
    public static void changeGrade(double amount) {
        grade=grade+amount;
    }
   
    public static void main(String[] args) {
        System.out.println("diem gpa:"+grade);
        
    }
}
