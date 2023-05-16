package com.thuanfpt.quanlysinhvien;
public class QuanLySinhVien {
    private int Mssv;
    private String name;
    private float DiemFE,DiemPE;

    public QuanLySinhVien(int Mssv, String name, float DiemFE, float DiemPE) {
        this.Mssv = Mssv;
        this.name = name;
        this.DiemFE = DiemFE;
        this.DiemPE = DiemPE;
    }

    public QuanLySinhVien() {
    }
    

    public int getMssv() {
        return Mssv;
    }

    public void setMssv(int Mssv) {
        this.Mssv = Mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemFE() {
        return DiemFE;
    }

    public void setDiemFE(float DiemFE) {
        this.DiemFE = DiemFE;
    }

    public float getDiemPE() {
        return DiemPE;
    }

    public void setDiemPE(float DiemPE) {
        this.DiemPE = DiemPE;
    }
    double DiemTrungBinh(){
        return (DiemPE+DiemFE)/2.0;
    }
    }


