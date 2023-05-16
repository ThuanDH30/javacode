package com.thuanfpt.coban;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class ForPhepNhan {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int multiplication=0;
        System.out.println("nhap n:");
    int n= sc.nextInt();
    for(int i=1;i<=20;i++){
         System.out.println(n + " x " + i + " = " + n*i);
  }
}
}
