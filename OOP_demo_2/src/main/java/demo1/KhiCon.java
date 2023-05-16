/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo1;

/**
 *
 * @author Bravo
 */
public class KhiCon extends KhiMe {
    private int SoLuongChan;

    public KhiCon(int SoLuongChan, String color, String coloereyes) {
        super(color, coloereyes);
        this.SoLuongChan = SoLuongChan;
       
    }
    public KhiCon(){
    
};
    public static void main(String[] args) {
        KhiCon k1=new KhiCon(4,"red","blue");
        KhiCon k2=new KhiCon();
    }

    @Override
    public String toString() {
        return super.toString()+"{khi con: so luong chan: "+this.SoLuongChan;
    }
    
}
