package Baslangic;

import java.util.Scanner;

public class RecursiveAsal {
    public static boolean asalMi(int sayi, int bolen) {
        if (sayi <= 1) {
            return false;
        }
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalMi(sayi, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi, sayi / 2)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }

        scanner.close();
    }


}
