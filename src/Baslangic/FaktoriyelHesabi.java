package Baslangic;

import java.util.Scanner;

public class FaktoriyelHesabi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kümenin eleman sayisi nedir");
        int n = scan.nextInt();
        System.out.println("alt küme eleman sayisi nedir");
        int r = scan.nextInt();
        int toplam1 = 1;
        int toplam2= 1;
        int toplam3 = 1;
        for (int i = 1; i <= n; i++) {
            toplam1 *= i;

        }
        for (int i = 1; i <=r ; i++) {
            toplam2 *= i;
        }
        for (int i = 1; i <=(n-r) ; i++) {
            toplam3 *=i;
        }
        System.out.println(n+" elemanlı kümenin "+r+" elemanlı alt küme sayısı : "+toplam1/(toplam2*toplam3));

    }
}
