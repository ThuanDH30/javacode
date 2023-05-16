package com.thuanfpt.coban;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConvertNumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int number = scanner.nextInt();

        NumberFormat nf = NumberFormat.getInstance(new Locale("vi", "VN"));
        String word = nf.format(number);

        System.out.println("Số " + number + " viết bằng chữ là: " + word);
    }
}
