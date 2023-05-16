package com.thuanfpt.coban;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class CanhTamGiac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap 3 canh cua tam giac:");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh " + a + ", " + b + ", " + c + " là 3 cạnh của tam giác");
        if(a*a==b*b+c*c || b*b==a*a+c*c||c*c==a*a+b*b){
            System.out.println(" ba canh " +a+","+ b+"," + c+" la 3 canh cua tam giac vuong ");
        }else{
            System.out.println(" ba canh " +a+"," +","+ b+"," + c+" khong phai la 3 canh cua tam giac vuong ");
        }
    } 
    }
}