package com.thuanfpt.coban;
import java.util.Scanner;
public class MangTrongJava {
    public static void main(String[] args) {
//        int[] arr=new int [100];
//        double[] arrd = new double[100];
//        int[] ar1={1,2,3};
    Scanner sc=new Scanner(System.in);
          int[] arr=new int [5];
          for(int i=0;i<5;i++){
          arr[i]=sc.nextInt();
          
    }
    int i=0;
    for(int item : arr){
    System.out.println("item index" +i+ "=" + item + "|");
    i++;
}
}
}
