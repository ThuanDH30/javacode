package com.thuanfpt.coban;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class TongSoChan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("nhap n:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i+=2){
        sum +=i;
    }
        System.out.println("tong so chan cua " +n+ " la " +sum);
    }
}
