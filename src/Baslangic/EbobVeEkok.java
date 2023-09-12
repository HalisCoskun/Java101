package Baslangic;

import java.util.Scanner;

public class EbobVeEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("sayı1 giriniz :");
        int sayi1 = scan.nextInt();
        System.out.print("sayı2 giriniz :");
        int sayi2 = scan.nextInt();

        int ebob = ebobBul(sayi1, sayi2);
        int ekok = (sayi1 * sayi2) / ebob;
        System.out.println("girilen sayilarin ekok değeri : "+ekok);
        System.out.println("girilen sayilarin ebob değeri : "+ebob);

    }

    private static int ebobBul(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
}


