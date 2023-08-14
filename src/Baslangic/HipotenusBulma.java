package Baslangic;
import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        double c;
        System.out.println("1. dik kenarı girin");
        a = scan.nextInt();
        System.out.println("2. dik kenari giriniz");
        b= scan.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Girilen ucgende hipotenus : "+c);
    }

}
