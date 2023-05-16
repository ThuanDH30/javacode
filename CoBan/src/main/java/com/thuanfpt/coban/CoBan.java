package com.thuanfpt.coban;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class CoBan {
        public static void Sum(int a,int b){
            System.out.println("a + b=" + (a+b));
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("nhap a= ");
            int a=sc.nextInt();
            System.out.println("nhap b=");
            int b=sc.nextInt();
            Sum(a,b);
        } 
}