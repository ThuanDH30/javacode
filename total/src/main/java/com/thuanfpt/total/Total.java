package com.thuanfpt.total;

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem Assignment: ");
        double assignment = sc.nextDouble();
        int[] lab = new int[6];
        int sumLab = 0;
        for (int i = 0; i < lab.length; i++) {
            System.out.print("nhap diem bai lab " + (i + 1) + ": ");
            lab[i] = sc.nextInt();
            sumLab += lab[i];
        }
        int[] other = new int[2];
        int sumOther = 0;
        for (int i = 0; i < other.length; i++) {
            System.out.print("Nhap diem bai PT thu " + (i + 1) + ": ");
            other[i] = sc.nextInt();
            sumOther +=  other[i];
        }
        System.out.println("Nhao diem PE: ");
        double pe = sc.nextDouble();
        System.out.println("Nhap diem FE: ");
        double fe = sc.nextDouble();
        double avg = ((assignment * 0.2)+((sumLab/6) * 0.1)+((sumOther/2 * 0.1))+(pe*0.2)+(fe*0.3));
        String grade;
        if (avg >= 9) {
            grade = "Xuat xac";
        } else if (avg >= 8) {
            grade = "Gioi";
        } else if (avg >= 7) {
            grade = "kha";
        } else if (avg >= 5) {
            grade = "Trung binh";
        } else {
            grade = "yeu";
        }
        System.out.println("diem trung binh: " + avg);
        System.out.println("xep loai: " + grade);
    }
}