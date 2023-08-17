package Baslangic;

import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {
        int year=1;

        String zodyak = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Dogum tarihiniz ? ");
        year = scan.nextInt();

        if (year>0){
            int remain = year%12;
            switch (remain){
                case 0: zodyak = "Maymun";
                    break;
                case 1: zodyak = "Horoz";
                    break;
                case 2: zodyak = "Köpek";
                    break;
                case 3: zodyak = "Domuz";
                    break;
                case 4: zodyak = "Fare";
                    break;
                case 5: zodyak = "Öküz";
                    break;
                case 6: zodyak = "Kaplan";
                    break;
                case 7: zodyak = "Tavşan";
                    break;
                case 8: zodyak = "Ejderha";
                    break;
                case 9: zodyak = "Yılan";
                    break;
                case 10: zodyak = "At";
                    break;
                case 11: zodyak = "Koyun";
                    break;
                default:
                    System.out.println("Hatali veri girdiniz");


            }

        }else System.out.println("hatali veri girdiniz");
        if (year>0){
            System.out.println("Çin takvimine göre burcunuz : "+zodyak);
        }

    }

}
