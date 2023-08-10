package Baslangic;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz");
        int mat = scan.nextInt();
        System.out.println("Fizik notunuzu giriniz");
        int fizik = scan.nextInt();
        System.out.println("Kimya notunuzu giriniz");
        int kimya = scan.nextInt();
        System.out.println("Turkce notunuzu giriniz");
        int turkce = scan.nextInt();
        System.out.println("Muzik notunuzu giriniz");
        int muzik = scan.nextInt();
        System.out.println("Tarih notunuzu giriniz");
        int tarih = scan.nextInt();
        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama = toplam/6.0;
        // ortalamanin 50 oldugunu varsayalim
        String sonuc = (ortalama>= 50) ? "tebrikler ortlamaniz: "+ortalama+" gectiniz" :"ortalamaniz : "
                +ortalama+" sinif tekrari";
        System.out.println(sonuc);
    }
}
