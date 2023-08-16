package Baslangic;

import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {
        String userName, password, select, newPassword;
        Scanner scan = new Scanner(System.in);
        System.out.print("kullanici adiniz ?");
        userName = scan.nextLine();
        System.out.print("sifreniz ? ");
        password = scan.nextLine();
        // basarili giris ornegi kullanicin capslock i açık unuttugunu varsayiyoruz
        if (userName.equalsIgnoreCase("patika") && password.equalsIgnoreCase("java123")){
            System.out.println("Giris yaptiniz");
        }
        // kullanici adi ve sifre yanlis ise
        if (!(userName.equalsIgnoreCase("patika")) && !(password.equalsIgnoreCase("java123"))){
            System.out.println("kullanici adi ve sifreniz yanlis girildi");
        }
        // sadece kullanici adi yanlis ise
        if (!(userName.equalsIgnoreCase("patika")) && (password.equalsIgnoreCase("java123"))){
            System.out.println("kullanici adiniz yanlis, tekrar deneyiniz");
        }
        // sadece parola yanlis ise, yeni sifre olusturmak isteyip istemedigini soruyoruz ve sifre olusturma islemi yapıyoruz
        if ((userName.equalsIgnoreCase("patika")) && !(password.equalsIgnoreCase("java123"))){
            System.out.println("sifrenizi yanlis girdiniz");
            System.out.println("yeni sifre olusturmak istiyorsaniz \nE\nolusturmak istemiyorsaniz\nH\nTusuna basiniz");
            select = scan.nextLine();
            if(select.equalsIgnoreCase("e")){
                System.out.println("daha once kullanamdigin bir sifre belirleyin");
                newPassword = scan.nextLine();
                if (!(newPassword.equalsIgnoreCase("java123"))){
                    System.out.println("sifreniz basari ile olusturuldu");
                }else{
                    System.out.println("sifreniz daha oncekilerle ayni olamaz");
                }
            }else if (select.equalsIgnoreCase("h")){
                System.out.println("iyi günler dileriz");
            }else{
                System.out.println("hatali giris lutfen H ve E olarak giris yapiniz");
            }
        }

    }
}
