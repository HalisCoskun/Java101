package Baslangic;

import java.util.Scanner;

public class SinifGecmeNotu {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz");
        mat = input.nextInt();
        System.out.print("türkçe notunuzu giriniz");
        turkce = input.nextInt();
        System.out.print("fizik notunuzu giriniz");
        fizik = input.nextInt();
        System.out.print("kimya notunuzu giriniz");
        kimya = input.nextInt();
        System.out.print("müzik notunuzu giriniz");
        muzik = input.nextInt();
        int total = (mat+turkce+fizik+kimya+muzik);
        double average = total/5;
        if (average>50){
            System.out.println("tebrikler sınıfı geçtiniz");
        }else{
            System.out.println("sinif tekrari yaptiniz");
        }
        System.out.println("tüm derslerden ortalamaniz: "+average);
    }
}
