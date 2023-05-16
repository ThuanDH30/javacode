package model;
import java.util.*;
public class SinhVien extends Person{

    public SinhVien(String name, int age) {
         super(name, age);
    }
    
    public static void main(String[] args) {
        SinhVien sv1=new SinhVien("thuan",18);
        System.out.println("ten cua sinh vien 1: "+ sv1.getName());
        System.out.println("chieu cao cua sinh vien 1 "+sv1.height);
    }
}
