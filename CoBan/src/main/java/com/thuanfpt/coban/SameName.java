package com.thuanfpt.coban;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class SameName {
    public static int min(int a,int b) {
        if(a<=b){
            return a;
        }else{
            return b;
        }
    }
    public static int min(int a,int b,int c){
        if(a<=b && a<=c){
            return a;
        }else if(b<=a && b<=c){
            return b;
        }else{
            return c;
        }
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a= ");
        int a=sc.nextInt();
        System.out.println("nhap b= ");
        int b=sc.nextInt();
        System.out.println("nhap c= ");
        int c=sc.nextInt();
        System.out.println(min(a,b,c));
       System.out.println(min(a,b));
    }
}