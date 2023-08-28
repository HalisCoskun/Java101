package Baslangic;

import java.util.Scanner;

public class DortVeBesinKatlari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int sayi = scan.nextInt();
        System.out.println("4 Ün katlari");
        for (int i = 1; i <=sayi ; i*=4) {
            System.out.println(i);
        }
        System.out.println("5 in katlari");
        for (int i = 1; i <=sayi ; i*=5) {
            System.out.println(i);
        }
    }
}
