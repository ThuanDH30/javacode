package com.thuanfpt.chunhat;
public class ChuNhat {
    double dai,rong;    

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public ChuNhat() {
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    double TinhDienTich(){
    return dai*rong;    
    }
    double TinhChuVi(){
        return (dai+rong)*2;
    }
}
    

