package com.thuanfpt.coban;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringToDate {
    public static void main(String[] args) throws Exception {
        String sDate ="18/08/2023" ;
        Date dateMinhMuon = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
        System.out.println(sDate +"\t"+ dateMinhMuon ); 
    }
}
