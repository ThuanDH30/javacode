package com.thuanfpt.coban;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class CheckMSSV {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap MSSV:");
        String a=sc.nextLine();
        if(a.matches("B[1-9]{7}")){
            System.out.println("MSSV hop le");
    }else{
            System.out.println("MSSV khong hop le");
        }
    }
}
