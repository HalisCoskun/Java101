package Baslangic;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1 - Toplama İşlemi");
        System.out.println("2 - Çıkarma İşlemi");
        System.out.println("3 - Çarpma İşlemi");
        System.out.println("4 - Bölme İşlemi");
        System.out.println("5 - Üslü Sayı Hesaplama");
        System.out.println("6 - Faktoriyel Hesaplama");
        System.out.println("7 - Mod Alma");
        System.out.println("8 - Dikdörtgen Alan ve Çevre Hesaplama");
        System.out.print("Seçiminizi yapın (1-8): ");

        int secim = scanner.nextInt();

        switch (secim) {
            case 1:

                System.out.print("Birinci sayıyı girin: ");
                int sayi1 = scanner.nextInt();
                System.out.print("İkinci sayıyı girin: ");
                int sayi2 = scanner.nextInt();
                System.out.println("Sonuç: " + toplama(sayi1, sayi2));
                break;
            case 2:

                System.out.print("Birinci sayıyı girin: ");
                int sayi3 = scanner.nextInt();
                System.out.print("İkinci sayıyı girin: ");
                int sayi4 = scanner.nextInt();
                System.out.println("Sonuç: " + cikarma(sayi3, sayi4));
                break;
            case 3:

                System.out.print("Birinci sayıyı girin: ");
                int sayi5 = scanner.nextInt();
                System.out.print("İkinci sayıyı girin: ");
                int sayi6 = scanner.nextInt();
                System.out.println("Sonuç: " + carpma(sayi5, sayi6));
                break;
            case 4:

                System.out.print("Birinci sayıyı girin: ");
                double sayi7 = scanner.nextDouble();
                System.out.print("İkinci sayıyı girin: ");
                double sayi8 = scanner.nextDouble();
                if (sayi8 != 0) {
                    System.out.println("Sonuç: " + bolme(sayi7, sayi8));
                } else {
                    System.out.println("Hata: Bir sayıyı sıfıra bölemezsiniz.");
                }
                break;
            case 5:

                System.out.print("Taban sayıyı girin: ");
                double taban = scanner.nextDouble();
                System.out.print("Üs sayıyı girin: ");
                double us = scanner.nextDouble();
                System.out.println("Sonuç: " + usluSayi(taban, us));
                break;
            case 6:

                System.out.print("Faktoriyelini hesaplamak istediğiniz sayıyı girin: ");
                int sayi9 = scanner.nextInt();
                if (sayi9 >= 0) {
                    System.out.println("Sonuç: " + faktoriyel(sayi9));
                } else {
                    System.out.println("Faktoriyel negatif sayılar için hesaplanamaz.");
                }
                break;
            case 7:

                System.out.print("Bölünen sayıyı girin: ");
                int sayi10 = scanner.nextInt();
                System.out.print("Bölen sayıyı girin: ");
                int sayi11 = scanner.nextInt();
                if (sayi11 != 0) {
                    System.out.println("Sonuç: " + modAl(sayi10, sayi11));
                } else {
                    System.out.println("Hata: Bölende sıfır olamaz.");
                }
                break;
            case 8:

                System.out.print("Dikdörtgenin uzun kenarını girin: ");
                double uzunKenar = scanner.nextDouble();
                System.out.print("Dikdörtgenin kısa kenarını girin: ");
                double kisaKenar = scanner.nextDouble();
                double alan = dikdortgenAlan(uzunKenar, kisaKenar);
                double cevre = dikdortgenCevre(uzunKenar, kisaKenar);
                System.out.println("Dikdörtgenin Alanı: " + alan);
                System.out.println("Dikdörtgenin Çevresi: " + cevre);
                break;
            default:
                System.out.println("Geçersiz seçim.");
                break;
        }

        scanner.close();
    }

    public static int toplama(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            return sayi1;
        }
        return toplama(sayi1 + 1, sayi2 - 1);
    }

    public static int cikarma(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            return sayi1;
        }
        return cikarma(sayi1 - 1, sayi2 - 1);
    }

    public static int carpma(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            return 0;
        }
        return sayi1 + carpma(sayi1, sayi2 - 1);
    }

    public static double bolme(double sayi1, double sayi2) {
        if (sayi1 < sayi2) {
            return 0;
        }
        return 1 + bolme(sayi1 - sayi2, sayi2);
    }

    public static double usluSayi(double taban, double us) {
        if (us == 0) {
            return 1;
        }
        return taban * usluSayi(taban, us - 1);
    }

    public static int faktoriyel(int sayi) {
        if (sayi == 0 || sayi == 1) {
            return 1;
        }
        return sayi * faktoriyel(sayi - 1);
    }

    public static int modAl(int sayi1, int sayi2) {
        if (sayi1 < sayi2) {
            return sayi1;
        }
        return modAl(sayi1 - sayi2, sayi2);
    }

    public static double dikdortgenAlan(double uzunKenar, double kisaKenar) {
        return uzunKenar * kisaKenar;
    }

    public static double dikdortgenCevre(double uzunKenar, double kisaKenar) {
        return 2 * (uzunKenar + kisaKenar);
    }
}
