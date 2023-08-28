package Baslangic;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayiyi gir");
        int sayi = scan.nextInt();
        System.out.println("üssü gir");
        int us = scan.nextInt();
        int total = 1;
        for (int i = 1; i <= us; i++) {
            total *= sayi;

        }
        System.out.println("üslü sayinin değeri : "+total);
    }
}
