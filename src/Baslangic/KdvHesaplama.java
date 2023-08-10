package Baslangic;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("para degeri girin");
        int para = scan.nextInt();
        double kdvliFiyat = para*1.18;
        double kdvdegeri = para*0.18;
        System.out.println("girilen tutarin kdvli degeri :"+kdvliFiyat+" kadv degeri ise :"+kdvdegeri+" dir");
    }
}
