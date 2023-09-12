package Baslangic;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = scan.nextInt();
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;

            }

        }

        if (toplam == sayi) {
            System.out.println("girilen sayı mükemmel sayıdır");
        } else {
            System.out.println("girilen sayı mükemmel sayı değildir");
        }
    }
}
