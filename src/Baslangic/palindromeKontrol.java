package Baslangic;

import java.util.Scanner;

public class palindromeKontrol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();


        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }


        scanner.close();
    }


    public static boolean isPalindrom(int sayi) {
        int orijinalSayi = sayi; // Orijinal sayıyı sakla
        int tersSayi = 0;
        int kalan;


        while (sayi != 0) {
            kalan = sayi % 10;  // Sayının son basamağını al
            tersSayi = tersSayi * 10 + kalan; // Ters sayıyı oluştur
            sayi /= 10; // Sayıyı 10'a bölerek bir basamağını at
        }

        // Orijinal sayı ile ters sayıyı karşılaştır
        return orijinalSayi == tersSayi;
    }
    }

