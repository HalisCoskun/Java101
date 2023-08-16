package Baslangic;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayi ?");
        sayi1 = scan.nextInt();
        System.out.println("2. sayi ?");
        sayi2 = scan.nextInt();
        System.out.println("aritmetik islemi yapmak icin\n1- toplama\n2- cikarma\n3- bolme\n4- carpma");
        secim = scan.nextInt();
        switch(secim){
            case 1:
                System.out.println("toplama sonucu : "+sayi1+sayi2);
                break;
            case 2:
                System.out.println("cikarma sonucu : "+(sayi1-sayi2));
                break;
            case 3:

                if (sayi2!=0){
                    System.out.println("bolme sonucu : "+(sayi1/sayi2));

                }else if (sayi2==0){
                    System.out.println("bolme isleminde payda 0 olamaz. Tekrar deneyin");
                }
                break;
            case 4:
                System.out.println("carpma sonucu : "+(sayi1*sayi2));
                break;
            default:
                System.out.println("Hatali giris yaptiniz");

        }


    }

}
