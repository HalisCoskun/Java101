package Baslangic;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Merak ettigin yili giriniz ");
        int year = scan.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Girilen "+year+" yılı artık yıldır");

        }else System.out.println(year+" yılı artık yıl değildir");
    }
}
