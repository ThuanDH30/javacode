/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thuanfpt.foundationjava;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class nhapsovachuoi {
    public static void main(String[] args) {
//    Scanner sc= new Scanner(System.in);
//    int k;
//    float x;
//    double y;
//    String a;
//    System.out.println("enter k=");
//    k= sc.nextInt();
//    System.out.println("enter x=");
//    x=sc.nextFloat();
//    System.out.println("enter y=");
//    y=sc.nextDouble();
//    System.out.println("enter string a=");
//    a=sc.nextLine();
//    System.out.println("k= "+ k +"x="+ x +"y="+  y);
        Scanner sc =new Scanner(System.in);
        int k;
        String s;
        while(true){
        try{
            System.out.println("enter k=");
            k=sc.nextInt();   
        }
        catch(Exception error){
            System.out.println(error.getMessage());
            System.out.println("data is invalid,please reenter");
            continue;    
        }  
        break;
        }
        System.out.println("an interger is " + k);
        System.out.println();
    }
    
}
