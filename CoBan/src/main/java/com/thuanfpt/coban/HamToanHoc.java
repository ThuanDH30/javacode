package com.thuanfpt.coban;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class HamToanHoc {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int a;
        System.out.println("nhap a= ");
        a= sc.nextInt();
        switch (a){
            case 1:
                System.out.println("ok1");
                break;
            case 2:
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
                break;
        }
    }
}
