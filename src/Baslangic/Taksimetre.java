package Baslangic;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km;
        double perKm = 2.20, total, startPrice = 10;
        System.out.println("gideceginiz km yi giriniz");
        km = scan.nextInt();
        total = km*perKm;
        total+= 10;

        total = (total<20)? 20:(km*perKm);
        System.out.println("Borcunuz : "+total);
    }
}
