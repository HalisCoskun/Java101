package Baslangic;

import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int num;
        do {
            System.out.println("Bir sayi gir ");
             num = scan.nextInt();
            if (num%2==1){
                total +=num;
            }
        }while (num>0);
        System.out.println("Girilen tek sayilar toplami :"+total);
    }
}
