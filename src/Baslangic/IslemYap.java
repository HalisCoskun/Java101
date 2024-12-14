package Baslangic;

import java.util.Scanner;

public class IslemYap {
    public static void islemYap(int sayi) {
        if (sayi <= 0) {
            System.out.println(sayi);
            return;
        }


        System.out.println(sayi);
        islemYap(sayi - 5);
        System.out.println(sayi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");
        int sayi = scanner.nextInt();

        islemYap(sayi);

        scanner.close();
    }


}
