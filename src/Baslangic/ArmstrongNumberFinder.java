package Baslangic;

import java.util.Scanner;

public class ArmstrongNumberFinder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int basamakSayisi = 0, rakam;
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int gecici = sayi;
        int gecici2 = sayi;

        while(gecici > 0) {
            gecici /= 10;
            basamakSayisi++;
        }
        while(sayi > 0) {
            rakam = sayi % 10;
            toplam += Math.pow(rakam, basamakSayisi);
            sayi /= 10;
        }
        if(toplam == gecici2) {
            System.out.println(gecici2 + " sayisi armstrong bir sayidir.");
        }
        else {
            System.out.println(gecici2 + " sayisi armstrong bir sayi degildir.");
        }
    }


    }

