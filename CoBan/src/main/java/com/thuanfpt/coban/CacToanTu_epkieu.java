package com.thuanfpt.coban;
import java.util.Scanner;

/**
 *
 * @author Bravo
 */
public class CacToanTu_epkieu {
     public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a= ");
        int a=sc.nextInt();
        System.out.println("nhap b= ");
        int b=sc.nextInt();
        float two=a;
        float three=b;
        float result= (float)(1.5+(two/three));
         System.out.println("result= "+result);
     }
    
}
