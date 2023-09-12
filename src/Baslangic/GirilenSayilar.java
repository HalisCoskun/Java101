package Baslangic;

import java.util.Scanner;

public class GirilenSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireciğinizi yazınız ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("geçersiz veri, sayı adedi pozitif olmalı");
            return;
        }

        int enBuyuk = Integer.MIN_VALUE;

        int enKucuk = Integer.MAX_VALUE;


        for (int i = 1; i <= N; i++) {
            System.out.print("Belirlediğin adet kadar sayı gir ");
            int number = scanner.nextInt();

            if (number > enBuyuk) {
                enBuyuk = number;
            }


            if (number < enKucuk) {
                enKucuk = number;
            }

        }

        System.out.println("En büyük  sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

        scanner.close();
    }

}
