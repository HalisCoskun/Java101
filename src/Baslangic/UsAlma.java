package Baslangic;

import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("taban değerini giriniz?:");
        int taban = scan.nextInt();
        System.out.println("üs değerini giriniz ? :");
        int us = scan.nextInt();
        int sonuc = usAlma(taban,us);
        System.out.println("işlemin sonucu : "+sonuc);

    }
    private static int usAlma(int taban, int us) {
        if (us==0){
            return 1;
        }
        return taban*usAlma(taban, us-1);
    }
}
