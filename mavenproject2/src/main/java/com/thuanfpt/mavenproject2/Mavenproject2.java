/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thuanfpt.mavenproject2;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
import java.util.Scanner;

public class Mavenproject2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a!=0 && b!=0){
			System.out.println("a is not equal to 0 and b is not equal to 0");
		}else if(a!=0 && b==0){
			System.out.println("a is not equal to 0 and b is equal to 0");
		}else if(a==0 && b!=0){
			System.out.println("a is equal to 0 and b is not equal to 0");
		}else{
			System.out.println("a is equal to 0 and b is equal to 0");
		}
		}
    }
