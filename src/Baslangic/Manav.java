package Baslangic;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armutKg, elmaKg, domatKg, muzKg, patlcnKg;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac kg Armut aldiniz");
        armutKg = scan.nextDouble();
        System.out.println("Kac kg Elma aldiniz");
        elmaKg = scan.nextDouble();
        System.out.println("Kac kg Domates aldiniz");
        domatKg = scan.nextDouble();
        System.out.println("Kac kg Muz aldiniz");
        muzKg = scan.nextDouble();
        System.out.println("Kac kg Patlican aldiniz");
        patlcnKg = scan.nextDouble();
        double totalPrice = armutKg*2.14+elmaKg*3.67+domatKg*1.11+muzKg*0.95+patlcnKg*5.0;
        System.out.println("Odemeniz gereken tutar : "+totalPrice);
    }
}
