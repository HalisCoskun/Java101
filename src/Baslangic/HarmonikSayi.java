package Baslangic;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Harmonik değer için sayı gir :");
        double sayi = scan.nextDouble();
        double sonuc = 0;
        for (double i = 1; i <=sayi ; i++) {
            sonuc+=(1/i);
        }
        System.out.println(sonuc);
    }
}
