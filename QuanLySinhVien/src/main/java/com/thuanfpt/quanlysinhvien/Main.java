package com.thuanfpt.quanlysinhvien;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        QuanLySinhVien sv=new QuanLySinhVien();
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ten:");
        sv.setName(sc.nextLine());
        System.out.print("nhap Mssv:");
        sv.setMssv(sc.nextInt());
        System.out.print("nhap diem PE:");
        sv.setDiemPE(sc.nextFloat());
        System.out.print("nhap diem FE:");
        sv.setDiemFE(sc.nextFloat());
        System.out.println("ten : "+sv.getName());
        System.out.println("Mssw : "+sv.getMssv());
        System.out.println("Diem Trung Binh : "+sv.DiemTrungBinh());
    }
    
}
