/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thuanfpt.coban;
import java.util.Scanner;

/**
 *
 * @author Bravo
 */
public class DoiViTri {
    public static void hoandoi(int a,int b) {
        int c=a;
        a=b;
        b=c;
        System.out.println("sau khi hoan doi: "+"a= "+a+"b= "+b);   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a= ");
        int a=sc.nextInt();
        System.out.println("nhap b=");
        int b=sc.nextInt();
        hoandoi(a,b);
    }
}
