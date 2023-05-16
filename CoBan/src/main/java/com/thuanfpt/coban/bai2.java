package com.thuanfpt.coban;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so nguyen:");
        int number=sc.nextInt();
        String[] worlds={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        if(number>=0 && number<=9){
            System.out.println("so" + number +"viet ban chu la "+worlds[number]);
        }else{
            System.out.println("so khong hop le");
        }
    }
}
