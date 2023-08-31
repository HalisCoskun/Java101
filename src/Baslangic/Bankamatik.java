package Baslangic;

import java.util.Scanner;

public class Bankamatik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password;
        int girisHakki = 3;
        int bakiye = 5000;
        int secim;
        while (girisHakki > 0) {
            System.out.print("kullanıcı adınız : ");
            userName = scan.nextLine();
            System.out.print("şifrenizi giriniz : ");
            password = scan.nextLine();
            if (userName.equals("patika") && password.equals("java123")) {
                System.out.println("Merhaba Halis Banka Hoşgeldiniz");
                do {
                    System.out.println("Para yatırmak için ==> 1\nPara çekmek için ==> 2\nBakiye sorgulamak için ==> 3\n" +
                            "Çıkış yapmak için ==> 4");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin");
                    secim = scan.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.println("yatırmak istediğiniz tutarı girin");
                            int canli = scan.nextInt();
                            bakiye += canli;
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz tutarı giriniz");
                            int cekilen = scan.nextInt();
                            if (bakiye > cekilen) {
                                bakiye -= cekilen;
                            } else System.out.println("Bakiyeniz yetersiz");
                            break;
                        case 3:
                            System.out.println("hesabınızdaki miktar : " + bakiye);
                            break;
                        case 4:
                            System.out.println("Efenim gene bekleriz");
                            break;
                    }


                } while (secim != 4);
                break;
            } else {
                girisHakki--;
                System.out.println("hatalı kullanıcı adı veya şifre. tekrar deneyiniz");
                if (girisHakki == 0) {
                    System.out.println("hesabınız bloke olmuştur");
                } else {
                    System.out.println("kalan hakkınız : " + girisHakki);
                }
            }
        }
    }
}
