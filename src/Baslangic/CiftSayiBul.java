package Baslangic;

import java.util.Scanner;

public class CiftSayiBul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi gir ");
        int sayi = scan.nextInt();
        int i = 1;
        while (i <= sayi) {

            if (i%2==0){
                System.out.println(i);
            }
            i++;

        }
    }
}
