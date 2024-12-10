package Baslangic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("fibonacci serisi için sayı girin :");
        int sayi = scan.nextInt();

        int a = 0;
        int b = 1;
        System.out.println("fibonacci serisi :");

        for (int i = 0; i <sayi ; i++) {
            System.out.print(a+ " ");  //mevcut fibonacci sayisini yazdırır
            //fibonacci saysısnı güncelle
            int next = a+b;
            a = b;
            b = next;
        }
        scan.close();
    }

}
