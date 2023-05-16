package com.thuanfpt.cars;
import java.util.Scanner;
public class Main {
    static Scanner sc=new Scanner(System.in);
    static void nhapxe(Cars xe) {
        System.out.println("nhap ma xe:");
        xe.setMaXe(sc.nextInt());
        System.out.println("nhap ten chu xe:");
        xe.setChuXe(sc.next());
        System.out.println("nhap dung tich:");
        xe.setDungTich(sc.nextInt());
        System.out.println("nhap gia tri xe:");
        xe.setTriGia(sc.nextFloat());
        System.out.println("nhap mo ta:");
        xe.setMoTa(sc.next());
    }
    public static void main(String[] args) {
        Cars x[]= null;
        int a,n=0;
        boolean flag=true;
        do{
            System.out.println("chon opption:");
            System.out.println("1.tao doi tuong xe va nhap thong tin");
            System.out.println("2.xuat bang ke khai tien thue cua cac xe");
            System.out.println("thoat");
            a=sc.nextInt();
            switch(a){
                case 1 -> {
                    System.out.println("nhap so luong xe muon khai thue:");
                    n=sc.nextInt();
                    x=new Cars[n];
                    for(int i=0;i<n;i++){
                        System.out.println("xe thu "+ (i+1));
                        x[i]=new Cars();
                        nhapxe(x[i]);
                    }
                }
                case 2 -> {
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n","Ma xe","Chu xe","Dung tich","Tri gia","mo ta","Thue");
                    for (int i = 0; i < n; i++) {
                        x[i].inthue();
                    }
                }
                default -> {
                    System.out.println("thoat");
                    flag=false;
                }    
        }
    }while(flag);
}
}
