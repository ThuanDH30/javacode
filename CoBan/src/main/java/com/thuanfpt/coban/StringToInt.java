/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thuanfpt.coban;

/**
 *
 * @author Bravo
 */
public class StringToInt {
    public static void main(String[] args) {
        int b=12;
        String bStr= String.valueOf(b);
     String a="5";
     int aInt = Integer.parseInt(a);
     float f= Float.parseFloat("4.5");
     double g=Double.parseDouble("5.6");
        System.out.println(bStr + "|" +aInt + "|" + f +"|"+g);
    }
    
}
