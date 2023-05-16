package com.thuanfpt.chunhat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ChuNhat hcn=new ChuNhat();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap chieu dai");
        hcn.setDai(sc.nextDouble());
        System.out.println("nhap chieu rong");
        hcn.setRong(sc.nextDouble());
        System.out.println("dien tich hinh chu nhat : "+hcn.TinhDienTich());
        System.out.println("chu vi hinh chu nhat : "+hcn.TinhChuVi());
    }
    
    
}
