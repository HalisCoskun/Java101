package Baslangic;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double boy;
        int kilo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden girin ");
        boy = scan.nextDouble();
        System.out.print("kilonuz ? ");
        kilo = scan.nextInt();
        double BMI = kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz : "+BMI);
    }
}
