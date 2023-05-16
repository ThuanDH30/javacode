package com.thuanfpt.cars;
public class Cars {
    private int MaXe,DungTich;
    private float TriGia;
    private String MoTa,ChuXe;

    public Cars(int MaXe, int DungTich, float TriGia, String MoTa, String ChuXe) {
        this.MaXe = MaXe;
        this.DungTich = DungTich;
        this.TriGia = TriGia;
        this.MoTa = MoTa;
        this.ChuXe = ChuXe;
    }

    public Cars() {
    }

    public int getMaXe() {
        return MaXe;
    }

    public void setMaXe(int MaXe) {
        this.MaXe = MaXe;
    }

    public int getDungTich() {
        return DungTich;
    }

    public void setDungTich(int DungTich) {
        this.DungTich = DungTich;
    }

    public float getTriGia() {
        return TriGia;
    }

    public void setTriGia(float TriGia) {
        this.TriGia = TriGia;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getChuXe() {
        return ChuXe;
    }

    public void setChuXe(String ChuXe) {
        this.ChuXe = ChuXe;
    }
    public double TinhThue(){
        double thue;
        if(DungTich<100){
            thue=TriGia*0.01;
        }else if(DungTich>=100 || DungTich<=200){
            thue=TriGia*0.03;
        }else{
            thue=TriGia*0.05;
        }
        return thue;
        
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    void inthue(){
    }
}
